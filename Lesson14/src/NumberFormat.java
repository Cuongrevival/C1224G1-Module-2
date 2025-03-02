import java.util.Scanner;
public class NumberFormat {
    public static void main(String[] args) {
        System.out.println("Nhập x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Nhập y: ");
        int y = sc.nextInt();
        calculate(x, y);
    }
    public static void calculate(int x, int y) {

        try {
            int result1 = x + y;
            int result2 = x - y;
            int result3 = x * y;
            int result4 = x / y;
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);
        }
        catch (Exception e) {
            System.out.println("không hợp lệ");
        }
    }
}
