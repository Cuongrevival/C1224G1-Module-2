package baitap1.src.com.codegym;

<<<<<<< HEAD
public class Circle extends Shape  {
=======
public class Circle extends Shape implements Resizable {
>>>>>>> 5c500bd (Bài tập và thực hành)
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
<<<<<<< HEAD
        radius += (radius * (percent / 100));
=======
        radius *= (percent / 100);
>>>>>>> 5c500bd (Bài tập và thực hành)
    }
}
