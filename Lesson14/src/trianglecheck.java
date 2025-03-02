
import java.util.Scanner;
public class trianglecheck {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first length: ");
        double a = sc.nextDouble();
        System.out.print("Enter second length: ");
        double b = sc.nextDouble();
        System.out.println("Enter third length: ");
        double c = sc.nextDouble();
        System.out.println("All of them become triangle.");
        triangleCheck(a, b, c);
    }

    public static void triangleCheck(double a, double b, double c) throws IllegalTriangleException {
     if (a <= 0 || b <= 0 || c <= 0) {
         throw new IllegalTriangleException("Invalid triangle");
     } else if (a + b <= c || b + c <= a || c + a <= b) {
         throw new IllegalTriangleException("Invalid triangle");
     }
    }
}
