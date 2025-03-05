package CountNumber;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getThread().isAlive()){
                System.out.println("Still counting");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
