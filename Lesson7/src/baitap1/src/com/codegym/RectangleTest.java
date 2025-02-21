package baitap1.src.com.codegym;

<<<<<<< HEAD
import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        Random rand = new Random();
        rectangles[0] = new Rectangle(3.6, 8.4);
        rectangles[1] = new Rectangle(5.4, 2.3);
        rectangles[2] = new Rectangle(7.4, 3.6, "yellow", false);
        rectangles[0].resize(rand.nextInt(100));
        rectangles[1].resize(rand.nextInt(100));
        rectangles[2].resize(rand.nextInt(100));
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.getLength() + " * " + rectangle.getWidth() + " = " + rectangle.getArea());
        }
    }
}


=======
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        rectangle.resize(56.2);
        System.out.println(rectangle);
    }
}
>>>>>>> 5c500bd (Bài tập và thực hành)
