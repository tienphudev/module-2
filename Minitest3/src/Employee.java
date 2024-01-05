public abstract class Employee {
    public String maNhanVien;
    public String hoVaTen;
    public int Age;
    public String phoneNumber;
    public String email;

    public Employee() {
    }

    public Employee(String maNhanVien, String hoVaTen, int age, String phoneNumber, String email) {
        this.maNhanVien = maNhanVien;
        this.hoVaTen = hoVaTen;
        Age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public abstract double getSalary();

}
