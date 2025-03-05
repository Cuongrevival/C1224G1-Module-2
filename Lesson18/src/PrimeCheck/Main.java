package PrimeCheck;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization LazyFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization OptimizedFactorization = new OptimizedPrimeFactorization();
        Thread t1 = new Thread(LazyFactorization);
        Thread t2 = new Thread(OptimizedFactorization);
        t1.start();
        try {
            t1.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
