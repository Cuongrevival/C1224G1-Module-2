package thuchanh;

public class TestShape {
    public static void main(String[] args) {
        Shape a = new Circle(5.7, "yellow", true);
        Shape b = new Rectangle(4.5, 8.7, "pink", true);
        Shape c = new Square(5.5, "blue", false);
        Shape d = new Shape("purple", false);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}