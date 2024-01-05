import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

public class ReafFileExample {
    public void readFileText(String filePath){
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new RuntimeException();
            }
            BufferedReader br= new BufferedReader(file);

        }

    }
}
