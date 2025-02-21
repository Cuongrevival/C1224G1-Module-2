package baitap4;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Nhập vào đây cạnh đầu tiên");
        double n = sc.nextDouble();
        triangle.setSide1(n);
        System.out.println("Nhập vào đây cạnh thứ hai");
        double n2 = sc.nextDouble();
        triangle.setSide2(n2);
        System.out.println("Nhập vào đây độ dài cạnh thứ ba");
        double n3 = sc.nextDouble();
        triangle.setSide3(n3);
        System.out.println("Nhập vào đây màu sắc hình tam giác");
        String s = sc.next();
        triangle.setColor(s);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getColor());
    }
}
