import java.sql.SQLOutput;
import java.util.Scanner;

public class BoddyMassIndex {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double weight;
        double height;
        double bmi;
        System.out.println("Your weight (in kilogram):");
        weight = scanner.nextDouble();
        System.out.println("Your height (in Meter):");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.println("Chi so bmi la :"+bmi);
        if (bmi<18)
            System.out.println("Underweight");
        else if(bmi<25.0)
            System.out.println("Normal");
        else if(bmi<30.0)
            System.out.println("Overweight");
        else
            System.out.println(("Obese"));

    }
}
