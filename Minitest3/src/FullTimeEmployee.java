public class FullTimeEmployee extends Employee{
    public double soTienThuong;
    public double soTienPhat;
    public double luongCung;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String maNhanVien, String hoVaTen, int age, String phoneNumber, String email, double soTienThuong, double soTienPhat, double luongCung) {
        super(maNhanVien, hoVaTen, age, phoneNumber, email);
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public double getSoTienThuong() {
        return soTienThuong;
    }

    public void setSoTienThuong(double soTienThuong) {
        this.soTienThuong = soTienThuong;
    }

    public double getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(double soTienPhat) {
        this.soTienPhat = soTienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }



    @Override
    public double getSalary() {
        return luongCung+(soTienThuong-soTienPhat);
}}