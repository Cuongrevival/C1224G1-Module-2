public class NhanVienFullTime extends NhanVien {
    private int soTienThuong;
    private int soTienPhat;
    private int tienCung;

    public NhanVienFullTime(String maNhanVien, String hoTen,
                            int tuoi, String telephoneNumber, String email,
                            int soTienThuong, int soTienPhat, int luongCung) {
        super(maNhanVien, hoTen, tuoi, telephoneNumber, email);
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.tienCung = luongCung;
    }
    @Override
    public int luongThucLinh() {
        return tienCung + (soTienThuong - soTienPhat);
    }

    @Override
    public String toString() {
        return super.toString() + " | Lương thực lĩnh: " + luongThucLinh();
    }

}

