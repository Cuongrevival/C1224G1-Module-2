package CountNumber;

public class Count implements Runnable {
    private Thread thread;

    public Count() {
        thread = new Thread(this, "Running thread");
        thread.start();

    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Counted " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public Thread getThread() {
        return thread;
    }
}
