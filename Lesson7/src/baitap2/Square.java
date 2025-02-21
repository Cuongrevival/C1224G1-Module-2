package baitap2;

public class Square implements Resizable, Colorable {
    private double sides;

    public Square() {
    }

    public Square(double sides) {
        this.sides = sides;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }
    public double getArea() {
        return sides * sides;
    }
    public double getPerimeter() {
        return sides * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sides=" + sides +
                '}';
    }
    @Override
    public void resize(double percent) {
        sides *= percent;
    }


    @Override
    public void howtoColor() {
        System.out.println("Color all four sides");
    }
}
