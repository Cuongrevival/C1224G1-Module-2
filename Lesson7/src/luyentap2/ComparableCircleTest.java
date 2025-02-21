package luyentap2;

import luyentap2.comparable.ComparableCircle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(5);
        circles[1] = new ComparableCircle(3.6);
        circles[2] = new ComparableCircle(9);
        System.out.println("Before sorting: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After sorting: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
