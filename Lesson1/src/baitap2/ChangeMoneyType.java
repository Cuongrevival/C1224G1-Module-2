package baitap2;
import java.util.Scanner;
public class ChangeMoneyType{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of USD to change: ");
        float USD = sc.nextFloat();
        float VND = USD * 23000;
        System.out.println(USD + " USD is " + VND + " VND");
    }
}
