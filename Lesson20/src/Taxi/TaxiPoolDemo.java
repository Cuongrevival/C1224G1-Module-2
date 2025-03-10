package Taxi;

public class TaxiPoolDemo {
    public static final int NUM_OF_CLIENTS = 10;
    public static void main(String[] args) {
        TaxiPool taxiPool = new TaxiPool();
        for (int i = 0; i < NUM_OF_CLIENTS; i++) {
            Runnable client = new TaxiThread(taxiPool);
            Thread thread = new Thread(client);
            thread.start();
        }
    }
}
