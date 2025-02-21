import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (checkPrime(num)) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }

    public static boolean checkPrime(int number) {
        boolean isPrime = false;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }
}
