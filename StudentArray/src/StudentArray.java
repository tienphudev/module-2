import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a name:");
        String a=scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(a)) {
                System.out.println("Position of the students in the list " + a + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + a + " in the list.");
        }
}}
