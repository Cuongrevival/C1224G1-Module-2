import java.util.Scanner;

class Rectangle {
    double height;
    double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public void display() {
        System.out.println("The area of the rectangle is " + calculateArea());
        System.out.println("The perimeter of the rectangle is " + calculatePerimeter());
    }

}

public class Draw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r3 = new Rectangle(2.3, 7.6);
        Rectangle r1 = new Rectangle();
        System.out.println("Enter the height of the rectangle: ");
        r1.setHeight(sc.nextDouble());
        System.out.println("Enter the width of the rectangle: ");
        r1.setWidth(sc.nextDouble());
        r1.display();
        Rectangle r2 = new Rectangle(r3.getHeight(), r3.getWidth());
        r2.display();
    }
}
