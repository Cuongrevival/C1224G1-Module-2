package thuchanh3;
import java.util.Scanner;

public class OperatorSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float chieuRong;
        float chieuDai;
        System.out.print("Nhập vào đây chiều dài: ");
        chieuRong = sc.nextFloat();
        System.out.print("Nhập vào đây chiều rộng: ");
        chieuDai = sc.nextFloat();
        float dienTich = chieuRong * chieuDai;
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
    }
}
