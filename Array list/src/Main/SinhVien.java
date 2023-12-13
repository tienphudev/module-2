package Main;

import javax.swing.JFormattedTextField;
import java.io.Serializable;
import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>, Serializable {
    private String maSinhVien;
    private String hoVaTen;
    private int namSinh;
    private double diemTrungBinh;

    public SinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public SinhVien(String maSinhVien, String hoVaTen, int namSinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }


    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", namSinh=" + namSinh +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }
    public int compareTo(SinhVien o){
        return this.maSinhVien.compareTo(o.maSinhVien);
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return  Objects.equals(maSinhVien, sinhVien.maSinhVien) || Objects.equals(hoVaTen, sinhVien.hoVaTen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
    }
}
