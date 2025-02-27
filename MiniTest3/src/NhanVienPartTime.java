public class NhanVienPartTime extends NhanVien {
    private int hour;


    public NhanVienPartTime(String maNhanVien, String hoTen,
                            int tuoi, String telephoneNumber,
                            String email, int hour) {
        super(maNhanVien, hoTen, tuoi, telephoneNumber, email);
        this.hour = hour;
    }
    @Override
    public int luongThucLinh() {
        return hour * 100000;
    }

    @Override
    public String toString() {
        return super.toString() + " | Lương thực lĩnh: " + luongThucLinh();
    }

}
