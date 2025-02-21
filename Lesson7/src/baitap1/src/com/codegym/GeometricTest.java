package baitap1.src.com.codegym;

import java.util.Random;

public class GeometricTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(45.6, "red", false);
        shapes[1] = new Rectangle(77.7, 115.4, "blue", false);
        shapes[2] = new Square(33.6, "purple", false);
        Random rand = new Random();
        Circle circle = (Circle) shapes[0];
        Rectangle rectangle = (Rectangle) shapes[1];
        Square square = (Square) shapes[2];
        PrintOutAnswer(circle, rectangle, square);
        circle.resize(rand.nextDouble(100.00));
        rectangle.resize(rand.nextDouble(100.00));
        square.resize(rand.nextDouble(100.00));
        PrintOutAnswer(circle, rectangle, square);
    }

    private static void PrintOutAnswer(Circle circle, Rectangle rectangle, Square square) {
        System.out.println(circle.getRadius() + " * " + circle.getRadius() + " * " + Math.PI + " = " + circle.getArea());
        System.out.println(rectangle.getLength() + " * " + rectangle.getWidth() + " = " + rectangle.getArea());
        System.out.println(square.getSides() + " * " + square.getSides() + " = " + square.getArea());
    }

}






