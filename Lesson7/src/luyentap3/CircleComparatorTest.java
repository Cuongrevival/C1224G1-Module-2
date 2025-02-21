package luyentap3;

import luyentap2.shape.Circle;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(5);
        circles[1] = new Circle();
        circles[2] = new Circle(3.7, "indigo", false);
        System.out.println("Before sorting: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("After sorting: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
