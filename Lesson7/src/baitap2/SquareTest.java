package baitap2;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        Square square2 = new Square(5);
        System.out.println(square2.getPerimeter());
        Square square3 = new Square(7);
        square.howtoColor();
        square3.howtoColor();
    }
}
