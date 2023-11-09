import java.util.Scanner;

public class TienlaiChoVay {
    public static void main(String[] args) {
        double money=1.0;
        int month=1;
        double interestRate=1.0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so tien gui");
        money = scanner.nextDouble();
        System.out.println("Nhap so thang gui");
        month = scanner.nextInt();
        System.out.println("Nhap lai suat");
        interestRate=scanner.nextDouble();
        double totalInterest=0;
        for (int i=0;i< month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
            System.out.println("Lai suat hang nam:"+totalInterest);
        }



    }
}
