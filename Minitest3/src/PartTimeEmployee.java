public class PartTimeEmployee extends Employee {
    public  int soGioLamViec;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String maNhanVien, String hoVaTen, int age, String phoneNumber, String email, int soGioLamViec) {
        super(maNhanVien, hoVaTen, age, phoneNumber, email);
        this.soGioLamViec = soGioLamViec;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }
    public double tinhLuongThucLinh(){
        return  soGioLamViec*1000;
    }

    @Override
    public double getSalary() {
        return  soGioLamViec*100000;
    }
}
