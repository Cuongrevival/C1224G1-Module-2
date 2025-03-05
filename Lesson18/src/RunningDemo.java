public class RunningDemo implements Runnable{
    private Thread thread;
    private final String threadName;
    public RunningDemo(String name) {
        threadName = name;
        System.out.println("Running " + threadName);
    }
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0 ; i--) {
                System.out.println("Running " + threadName + " " + i);
                Thread.sleep(50);
            }
        } catch (RuntimeException | InterruptedException e) {
            System.out.println("Thread " + threadName + " is interrupted");
        }
        System.out.println("Thread " + threadName + " existing");
    }
    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

    public static void main(String[] args) {
        System.out.println("RacingCar.CountNumber.Main started");
        RunningDemo demo = new RunningDemo("Thread-1-HR-Database");
        demo.start();
        RunningDemo demo2 = new RunningDemo("Thread-2-Send-Email");
        demo2.start();
        System.out.println("RacingCar.CountNumber.Main ended");
    }
}
