
        import java.util.Arrays;
import java.util.Scanner;

        public class InsertIntoArrayExample {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Bước 1: Khai báo và khởi tạo mảng số nguyên
                System.out.print("Nhập số phần tử của mảng: ");
                int N = scanner.nextInt();

                int[] array = new int[N];
                System.out.println("Nhập các phần tử của mảng:");
                for (int i = 0; i < N; i++) {
                    System.out.print("Phần tử thứ " + (i + 1) + ": ");
                    array[i] = scanner.nextInt();
                }

                // Bước 2: Nhập số cần chèn
                System.out.print("Nhập số cần chèn: ");
                int X = scanner.nextInt();

                // Bước 3: Nhập vị trí index cần chèn X vào trong mảng
                System.out.print("Nhập vị trí index cần chèn: ");
                int index = scanner.nextInt();

                // Bước 4: Kiểm tra điều kiện vị trí index
                if (index < 0 || index > array.length - 1) {
                    System.out.println("Không thể chèn phần tử vào mảng.");
                } else {
                    // Bước 5: Chèn phần tử X vào mảng
                    int[] newArray = new int[N + 1];
                    for (int i = 0; i < index; i++) {
                        newArray[i] = array[i];
                    }
                    newArray[index] = X;
                    for (int i = index + 1; i < newArray.length; i++) {
                        newArray[i] = array[i - 1];
                    }

                    // Bước 6: In ra mảng mới
                    System.out.println("Mảng sau khi chèn: " + Arrays.toString(newArray));
                }

                scanner.close();
            }
        }



