package baitap1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea() * height * height;
    }

    @Override
    public String toString() {
        return "We have a cylinder of height = " + height + ", which is a subclass of " + super.toString();
    }
}
