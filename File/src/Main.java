import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            File ka = new File("ka.txt");

            FileReader fileReader = new FileReader(ka);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Lỗi không ghi được dữ liêu");
        }
    }
}
