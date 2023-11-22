import java.util.Arrays;
import java.util.Scanner;

public class DeleteFromArrayExample {
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

        // Bước 2: Nhập phần tử cần xoá
        System.out.print("Nhập phần tử cần xoá: ");
        int X = scanner.nextInt();

        // Bước 3: Tìm vị trí của phần tử cần xoá
        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del != -1) {
            // Bước 4: Xoá phần tử X khỏi mảng
            for (int i = index_del; i < N - 1; i++) {
                array[i] = array[i + 1];
            }

            // Bước 5: In ra mảng sau khi xoá
            System.out.println("Phần tử " + X + " đã được xoá khỏi vị trí " + index_del);
            System.out.println("Mảng mới: " + Arrays.toString(Arrays.copyOf(array, N - 1)));
        } else {
            System.out.println("Phần tử " + X + " không xuất hiện trong mảng.");
        }

        scanner.close();
    }
}


