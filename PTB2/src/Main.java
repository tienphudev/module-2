import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập hệ số a,b và c:");
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        double c= scanner.nextDouble();
    QuadraticEquation equation= new QuadraticEquation(a,b,c);
    equation.solveEquation();
    scanner.close();
    }

}