package Test;

import Main.DanhSachSinhVien;
import Main.SinhVien;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        do {
            System.out.println("MENU---------");
            System.out.println("Vui lòng chọn chức năng.\n");
            System.out.println("1. Thêm sinh viên vào danh sách\n" +
                    "2. In danh sách ra màn hình\n" +
                    "3.Kiểm tra danh sách có rõng hay không\n" +
                    "4.Lấy sô lượng sinh vien trong danh sách\n" +
                    "5.Làm rỗng danh sách sinh viên\n" +
                    "6.Kiểm tra sinh viên có tồn tại hay không,dựa tren mã sinh viên\n" +
                    "7.Xoá môt sinh viên ra khỏi danh sách dựa trên mã sinh viên\n" +
                    "8.Tìm kiếm tát cả sinh viên dựa trên Tên được nhập từ bàn phím\n" +
                    "9. Xuất danh sách sinh có điểm từ cao tới thấp\n" +
                    "0.Thoát khỏi chương trình");
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1) {
                System.out.println("Nhap mã sinh viên: ");
                String maSinhVien = sc.nextLine();
                System.out.println("Nhap họ và tên: ");
                String hoVaTen = sc.nextLine();
                System.out.println("Nhap năm sinh: ");
                int namSinh = sc.nextInt();
                System.out.println("Nhap diếm trung bình: ");
                double diemTrungBinh = sc.nextDouble();
                SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);

                String[] Student = {maSinhVien, hoVaTen, String.valueOf(namSinh), String.valueOf(diemTrungBinh)};

                try {
                    PrintWriter  writer= new PrintWriter("D:\\\\Codegym\\\\Module 2\\\\Array list\\\\src\\\\Student.CSV");
                    writer.print(Student);
                    writer.flush();
                    writer.close();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            } else if (luaChon == 2) {
                dssv.inDanhSachSinhVien();

            } else if (luaChon == 3) {
                System.out.println(dssv.kiemTraDanhSachRong());

            } else if (luaChon == 4) {
                System.out.println("Số lượng hiện tại: " + dssv.soLuongSinhVien());
            } else if (luaChon == 5) {
                dssv.lamRongDanhSach();

            } else if (luaChon == 6) {
                System.out.println("Nhap mã sinh viên: ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Kiểm tra sinh viên có tồn tại trong danh sách:" + dssv.kiemTraTonTai(sv));
            } else if (luaChon == 7) {
                System.out.println("Nhap mã sinh viên: ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Xoa sinh vien trong danh sach: " + dssv.xoaSinhVien(sv));
            } else if (luaChon == 8) {
                System.out.println("Nhap tên học sinh: ");
                String hovaTen = sc.nextLine();
                System.out.println("Kết quả tìm kiếm:");
                dssv.timSinhVien(hovaTen);


            } else if (luaChon == 9) {
                dssv.sapXepSinhVienGiamDanTheoDiem();
                dssv.inDanhSachSinhVien();


            }
        } while (luaChon != 0);
    }
}
