package SwapNumber;


public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("number: " + Thread.currentThread().getName() + " number: " + i + " hashCode: " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Couldn't generate number");
            }
        }
    }
}
