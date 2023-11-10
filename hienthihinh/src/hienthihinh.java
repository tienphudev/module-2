import java.util.Scanner;

public class hienthihinh {
    public static void main(String[] args) {
        int choice = -1;

        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print the isosceles triangle");
        System.out.println("0.Exit");
        System.out.println("Enter your choice");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Chiêu dài: ");
                int a = scanner.nextInt();
                System.out.println("Chiều rộng: ");
                int b = scanner.nextInt();
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < b; j++) {
                        System.out.print("*");

                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Nhap chieu cao: ");
                int c = scanner.nextInt();
                for (int i = 0; i < c; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                int rows = 4; // Số hàng của tam giác cân
                int spaces = rows - 1; // Số khoảng trống ở mỗi hàng

                for (int i = 0; i < rows; i++) {
                    // In khoảng trống ở mỗi hàng
                    for (int j = 0; j < spaces; j++) {
                        System.out.print(" ");
                    }

                    // In các dấu * ở mỗi hàng
                    for (int k = 0; k < 2 * i + 1; k++) {
                        System.out.print("*");
                    }

                    // Xuống dòng sau khi hoàn thành mỗi hàng
                    System.out.println();

                    // Giảm số khoảng trống sau mỗi hàng
                    spaces--;
                }
        }
    }while(choice!=0);
}}








