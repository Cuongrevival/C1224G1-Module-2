package luyentap2.shape;

public class Rectangle extends Shape{
   private double width;
   private double height;

    public Rectangle() {
        width = height = 1.0;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
    @Override
    public String toString() {
        return "A Rectangle with width = " + width + ", height = " + height + ", which is a subclass of " + super.toString();
    }
}
