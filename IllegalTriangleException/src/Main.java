import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
            System.out.println("Nhập a:");
            int a = scanner.nextInt();
            System.out.println("Nhập b:");
            int b = scanner.nextInt();
            System.out.println("Nhập c:");
            int c = scanner.nextInt();
        try {
            double area= IllegalTriangleException.calculateTriangleArea(a,b,c);
            System.out.println("Diện tich:"+ area);
        } catch (IllegalTriangleException i) {
            System.out.println("Lỗi: " + i.getMessage());
        }

    }
}