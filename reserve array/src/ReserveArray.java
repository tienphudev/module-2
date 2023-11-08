import java.util.Arrays;
import java.util.Scanner;

public class ReserveArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        for (int j = 0; j < size; j++)
        {
            array[j] = scanner.nextInt();
        }
        while (i < array.length /2) {
                int temp = array[i];
                array[i] = array[size - i - 1];
                array[size - i -1] = temp;
            i++;
        }
        System.out.println(Arrays.toString(array));
    }

}

