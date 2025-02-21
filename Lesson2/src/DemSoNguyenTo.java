import java.util.Scanner;

public class DemSoNguyenTo {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the amount of number: ");
            num = sc.nextInt();
            if (num > 20) {
                System.out.println("The number is greater than 20");
            } else {
                int count = 0;
                int n = 2;
                while (count < num) {
                    if (checkPrime(n)) {
                        System.out.print(n + " ");
                        count++;
                    }
                    n++;
                }
            }
        }
        while (num > 20);
    }

        public static boolean checkPrime ( int number){
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }
    }
