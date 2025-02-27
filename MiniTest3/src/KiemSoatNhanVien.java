import java.util.Scanner;
public class KiemSoatNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLiNhanVien quanLiNhanVien = new QuanLiNhanVien();
        quanLiNhanVien.themNhanVien(new NhanVienFullTime("001", "Nguyen Van An", 30,
                "0123456789", "an@gmail.com", 500000, 100000, 10000000));
        quanLiNhanVien.themNhanVien(new NhanVienFullTime("002", "Tran Van Binh", 25,
                "0987654321", "binh@gmail.com", 200000, 50000, 2000000));
        quanLiNhanVien.themNhanVien(new NhanVienFullTime("003", "Nguyen Tran Trung Kien", 23,
                "0965348721", "kien@gmail.com", 300000, 100000, 9000000));
        quanLiNhanVien.themNhanVien(new NhanVienFullTime("004", "Lai Van Hong", 29,
                "0544784698", "hong@gmail.com", 800000, 50000, 8000000));
        quanLiNhanVien.themNhanVien(new NhanVienPartTime("005", "Le Thi Cuc", 22,
                "0345678912", "cuc@gmail.com", 8));
        quanLiNhanVien.themNhanVien(new NhanVienPartTime("006", "Le Van Trung", 21,
                "0145888763", "trung@gmail.com", 8));
       quanLiNhanVien.HienNhanVien();
        System.out.println("Tiền lương trung bình: " + quanLiNhanVien.tinhTienLuongTrungBinh());
        System.out.println("Nhân viên toàn thời gian có lương thấp hơn trung bình: ");
        quanLiNhanVien.nhanVienToanThoiGianLuongThap();
        System.out.println("Tổng số lương phải trả cho tất cả nhân viên part-time: "
                + quanLiNhanVien.TongLuongNhanVienPartTime());
        System.out.println("Những nhân viên làm việc full-time với lương xếp tăng dần: ");
        quanLiNhanVien.sapXepNhanVienTangDan();
        System.out.println("Bạn muốn tìm nhân viên nào: ");
        String nhanVienCanTim = sc.nextLine();
        quanLiNhanVien.timKiemNhanVien(nhanVienCanTim);
        sc.close();
    }

}
