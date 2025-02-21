package baitap1.src.com.codegym;

<<<<<<< HEAD
public class Rectangle extends Shape {
=======
public class Rectangle extends Shape implements Resizable {
>>>>>>> 5c500bd (Bài tập và thực hành)
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

<<<<<<< HEAD
    public Rectangle(double width) {
        this.width = width;
    }

    public Rectangle(double width, String color, boolean filled) {
        super(color, filled);
        this.width = width;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

=======
>>>>>>> 5c500bd (Bài tập và thực hành)
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
<<<<<<< HEAD

    @Override
    public void resize(double percent) {
        width += (width * (percent / 100));
        length += (length * (percent / 100));
=======
    @Override
    public void resize(double percent) {
        setWidth(width * (percent / 100));
        setLength(length * (percent / 100));
>>>>>>> 5c500bd (Bài tập và thực hành)
    }
}