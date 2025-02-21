import java.util.Scanner;

public class MethodChangeDegree {

    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Exit");
        System.out.println("Enter your choice: ");
         choice = sc.nextInt();
         switch (choice) {
                case 1:
                    System.out.println("Enter degree in Celsius: ");
                    double celsius = sc.nextDouble();
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.printf("Celsius to Fahrenheit: %f", fahrenheit);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter degree in Fahrenheit: ");
                    double fahrenheit1 = sc.nextDouble();
                    double celsius1 = fahrenheitToCelsius(fahrenheit1);
                    System.out.printf("Fahrenheit to Celsius: %f", celsius1);
                    System.out.println();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
    public static double celsiusToFahrenheit(double c) {
        return c / (5.0 / 9) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (5.0 / 9) * (f - 32);
    }
}
