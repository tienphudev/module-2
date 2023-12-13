package main;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class viDuDocText {
    public static void main(String[] args) {
        File f=new File("D:\\Codegym\\Module 2\\Array list\\src");
     try{
        BufferedReader br= Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
    String line = null;
     while(true){
         line=br.readLine();
         if(line==null){break;}
         else{
             System.out.println();
     }
}
