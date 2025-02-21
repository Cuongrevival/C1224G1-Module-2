package thuchanh4;
import java.util.Scanner;

public class LineEquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào đây số đầu tiên");
        float a = sc.nextFloat();
        System.out.println("Nhập vào đây số thứ hai");
        float b = sc.nextFloat();
        System.out.println("Nhập vào đây số thứ ba");
        float c = sc.nextFloat();
        float result = (c - b) / a;
        if (a == 0){
            System.out.println("Phương trình vô nghiệm");
        } else {
            if (c == 0 && b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            }
            System.out.println("Phương trình có nghiệm là: " + result);
        }
    }
}
