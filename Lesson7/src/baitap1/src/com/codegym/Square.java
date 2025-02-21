package baitap1.src.com.codegym;

<<<<<<< HEAD
public class Square extends Rectangle {
=======
public class Square implements Resizable, Colorable{
>>>>>>> 5c500bd (Bài tập và thực hành)
    private double sides;

    public Square() {
    }

    public Square(double sides) {
<<<<<<< HEAD
        super(sides);
    }

    public Square(double sides, String color, boolean filled) {
        super(color, filled);
        this.sides = sides;

=======
        this.sides = sides;
>>>>>>> 5c500bd (Bài tập và thực hành)
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }
<<<<<<< HEAD

    public double getArea() {
        return sides * sides;
    }

=======
    public double getArea() {
        return sides * sides;
    }
>>>>>>> 5c500bd (Bài tập và thực hành)
    public double getPerimeter() {
        return sides * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sides=" + sides +
                '}';
    }
<<<<<<< HEAD

    @Override
    public void resize(double percent) {
        sides += sides * (percent / 100);
    }


=======
    @Override
    public void resize(double percent) {
        sides *= percent;
    }


    @Override
    public void howtoColor() {
        System.out.println("Color all four sides");
    }
>>>>>>> 5c500bd (Bài tập và thực hành)
}
