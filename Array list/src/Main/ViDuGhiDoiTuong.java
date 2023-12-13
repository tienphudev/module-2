package Main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong {
   public static void main(String[] args){
       try{
    File file=new File("D:\\Codegym\\Module 2\\Array list\\File.data");
    OutputStream os= new FileOutputStream(file);
           ObjectOutputStream oos=new ObjectOutputStream(os);
           
       }
    catch(Exception e){
           {



}
