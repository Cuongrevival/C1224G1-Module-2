import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuanLiNhanVien {
    List<NhanVien> danhSachNhanVien = new ArrayList<>();
public void HienNhanVien() {
    for (NhanVien nv : danhSachNhanVien) {
        System.out.println(nv);
    }
}
    public void themNhanVien(NhanVien nv) {
        danhSachNhanVien.add(nv);
    }

    public int tinhTienLuongTrungBinh() {
        long tongLuong = 0;
        long luongTrungBinh;
        for (NhanVien nv : danhSachNhanVien) {
            tongLuong += nv.luongThucLinh();
        }
        luongTrungBinh = tongLuong / danhSachNhanVien.size();
        return (int) luongTrungBinh;
    }

    public void nhanVienToanThoiGianLuongThap() {
        List<NhanVienFullTime> nhanVienFullTimeList = new ArrayList<>();
        int luongTrungBinh = tinhTienLuongTrungBinh();
        for (NhanVien nv : danhSachNhanVien) {
            if (nv instanceof NhanVienFullTime) {
                if (nv.luongThucLinh() < luongTrungBinh) {
                    nhanVienFullTimeList.add((NhanVienFullTime) nv);
                }
            }
        }
        for (NhanVien nv : nhanVienFullTimeList) {
            System.out.println(nv);
        }
    }

    public int TongLuongNhanVienPartTime() {
        int tongLuongPhaiTra = 0;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv instanceof NhanVienPartTime) {
                tongLuongPhaiTra += nv.luongThucLinh();
            }
        }
        return tongLuongPhaiTra;
    }

    public void sapXepNhanVienTangDan() {
        List<NhanVienFullTime> nhanVienFullTimeList = new ArrayList<>();
        for (NhanVien nv : danhSachNhanVien) {
            if (nv instanceof NhanVienFullTime) {
                nhanVienFullTimeList.add((NhanVienFullTime) nv);
            }
        }
        nhanVienFullTimeList.sort(new Comparator<NhanVienFullTime>() {
            @Override
            public int compare(NhanVienFullTime o1, NhanVienFullTime o2) {
                return o1.luongThucLinh() - o2.luongThucLinh();
            }
        });
        for (NhanVienFullTime nv1 : nhanVienFullTimeList) {
            System.out.println(nv1.hoTen + " " + nv1.luongThucLinh());
        }
    }

    public void timKiemNhanVien(String ten) {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Không có nhân viên trong công ty");
            return;
        }
        boolean found = false;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getHoTen().toLowerCase().contains(ten.toLowerCase())) {
                System.out.println("Tìm thấy: " + nv.hoTen);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên trong công ty");

        }
    }
}

