import java.util.Scanner;

class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }
    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public double getRoot3() {
        return -b / (2 * a);
    }

}
public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation eq = new QuadraticEquation(a, b, c);
        if (eq.getDiscriminant() > 0.0) {
            System.out.printf("The equation has two roots: %.5f and %.4f", eq.getRoot1(), eq.getRoot2());
        } else if (eq.getDiscriminant() == 0.0) {
            System.out.printf("The equation has one roots: %.0f", eq.getRoot3());
        } else {
            System.out.println("The equation has no real root");
        }
    }
}
