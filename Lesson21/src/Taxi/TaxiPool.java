package Taxi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class TaxiPool {
    private static final long EXPIRED_TIME = 1000 * 60 * 60 * 24;
    private static final int NUMBER_OF_TAXI = 5;
    private final List<Taxi> available = Collections.synchronizedList(new ArrayList<>());
    private final List<Taxi> inUse = Collections.synchronizedList(new ArrayList<>());
    private final AtomicInteger count = new AtomicInteger(0);
    private final AtomicBoolean waiting = new AtomicBoolean(false);

    public synchronized void release(Taxi taxi) {
        inUse.remove(taxi);
        available.add(taxi);
        System.out.println(taxi.getName() + " released");
    }
    public synchronized Taxi getTaxi() {
        if (!available.isEmpty()) {
            Taxi taxi = available.get(0);
            inUse.add(taxi);
            return taxi;
        }
        if (count.get() >= NUMBER_OF_TAXI) {
            this.waitingUntilTaxiAvailable();
            return this.getTaxi();
        }
        Taxi taxi = new Taxi();
        inUse.add(taxi);
        return taxi;
    }
    private Taxi createTaxi() {
        waiting(200);
        Taxi taxi = new Taxi("Taxi " + count.getAndIncrement());
        System.out.println(taxi.getName() + " created");
        return taxi;
    }

    private void waiting(long time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    private void waitingUntilTaxiAvailable() {
        if (waiting.get()) {
            waiting.set(false);
            throw new TaxiNotFoundException("No Taxi Available");
        }
        waiting.set(true);
        waiting(EXPIRED_TIME);
    }

    private static class TaxiNotFoundException extends RuntimeException {
        public TaxiNotFoundException(String s) {
            System.out.println(s);
        }
    }

}
