package baitap1.src.com.codegym;

<<<<<<< HEAD
public abstract class Shape implements Resizable{
=======
public class Shape {
>>>>>>> 5c500bd (Bài tập và thực hành)
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
<<<<<<< HEAD
    public abstract double getArea();
    public abstract double getPerimeter();
=======
>>>>>>> 5c500bd (Bài tập và thực hành)

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
