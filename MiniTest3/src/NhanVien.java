public abstract class NhanVien {
    protected String maNhanVien;
    protected String hoTen;
    protected int tuoi;
    protected String telephoneNumber;
    protected String email;

    public NhanVien(String maNhanVien, String hoTen, int tuoi, String telephoneNumber, String email) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract int luongThucLinh();
    @Override
    public String toString() {
        return "Mã NV: " + maNhanVien + " | Tên: " + hoTen + " | Tuổi: " + tuoi +
                " | SDT: " + telephoneNumber + " | Email: " + email;
    }

}
