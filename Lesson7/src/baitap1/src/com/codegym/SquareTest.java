package baitap1.src.com.codegym;

<<<<<<< HEAD
import java.util.Random;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            squares[i] = new Square(3.65);
        }
        for (Square square : squares) {
            System.out.println(square.getSides() + " * " + square.getSides() + " = " + square.getArea());
        }
=======
public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        Square square2 = new Square(5);
        System.out.println(square2.getPerimeter());
        Square square3 = new Square(7);
        square.howtoColor();
        square3.howtoColor();
>>>>>>> 5c500bd (Bài tập và thực hành)
    }
}
