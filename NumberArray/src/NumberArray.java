import java.util.Scanner;


public class NumberArray {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size ");
        size = scanner.nextInt();
        do {
            if (size > 20) {
                System.out.println("size is not exceed 20");
                break;
            }

        } while (size>20);
         array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Property list");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
            int max = array[0];
            int index = 1;
                    for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j + 1;
                }
            }
            System.out.println("the largest property value in the list is " + max + ",at position" + index);
        }
    }








