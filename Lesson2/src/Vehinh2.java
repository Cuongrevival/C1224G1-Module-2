import java.util.Scanner;

public class Vehinh2 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print the isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Please enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The rectangle is printed");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 20; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:
                    System.out.println("Bottom-left");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    System.out.println("Top-left");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    System.out.println("Bottom-right");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = i; j < 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Bottom-right");
                    int height = 5;
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("The isosceles triangle is printed");

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
