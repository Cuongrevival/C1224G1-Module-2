import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1. Vẽ hình tam giác");
            System.out.println("2. Vẽ hình vuông");
            System.out.println("3. Vẽ hình chữ nhật");
            System.out.println("4. Thoát");
            System.out.println("Xin hãy lựa chọn");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 20; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    break;
            }
        }
    }
}
