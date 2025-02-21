package baitap1.src.com.codegym;

<<<<<<< HEAD
import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        Random rand = new Random();
        circles[0] = new Circle();
        circles[1] = new Circle(8.6);
        circles[2] = new Circle(5.5, "red", true);
        circles[0].resize(rand.nextInt(100));
        circles[1].resize(rand.nextInt(100));
        circles[2].resize(rand.nextInt(100));
        for (Circle circle : circles) {
            System.out.println(circle.getRadius() + " * " + circle.getRadius() + " * " + Math.PI + " = " + circle.getArea());
        }
=======
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        circle.resize(13.6);
        System.out.println(circle);
>>>>>>> 5c500bd (Bài tập và thực hành)
    }
}