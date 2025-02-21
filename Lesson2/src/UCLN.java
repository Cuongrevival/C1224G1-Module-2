import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào đây số đầu tiên ");
        int number = sc.nextInt();
        System.out.println("Nhập vào đây số thứ hai ");
        int number2 = sc.nextInt();
        System.out.println("UCLN của hai số là: " + (GCD(number, number2)));
    }

    public static int GCD(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
    }
}

