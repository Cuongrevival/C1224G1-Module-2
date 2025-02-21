import java.util.Scanner;

public class VayLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn vay bao nhiêu tiền? ");
        double vay = sc.nextDouble();
        System.out.println("Nhập vào đây tỉ lệ lãi suất theo tháng ");
        double tiLe = sc.nextDouble();
        System.out.println("Bạn muốn vay trong bao nhiêu tháng? ");
        int thang = sc.nextInt();
        double tong_tien = 0;
        for (int i = 0; i < thang; i++) {
            tong_tien += vay * (tiLe / 100) / 12 * thang;
        }
        System.out.println("Số tiền lãi là: " + tong_tien);
    }
}
