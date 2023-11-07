import java.util.Scanner;

public class sothanhchu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;


        }
        if (number >= 10 && number < 20) {
            switch (number) {
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;

            }
        }
        int tenNumber = number/10;
        int numbers = number % 10;
        String resultTenNumber = "";
        String resultNumbers = "";
        if (number >= 20 && number <= 99) {
            switch (tenNumber) {
                case 2:
                    resultTenNumber = "Twenty";
                    break;
                case 3:
                    resultTenNumber = "Thirty";
                    break;
                case 4:
                    resultTenNumber = "Forty";
                    break;
                case 5:
                    resultTenNumber = "Fifty";
                    break;
                case 6:
                    resultTenNumber = "Sixty";
                    break;
                case 7:
                    resultTenNumber = "Seventy";
                    break;
                case 8:
                    resultTenNumber = "Eighty";
                    break;
                case 9:
                    resultTenNumber = "Ninety";
                    break;
            }
            switch (numbers) {
                case 1:
                    resultNumbers = "One";
                    break;
                case 2:
                    resultNumbers = "Two";
                    break;
                case 3:
                    resultNumbers = "Three";
                    break;
                case 4:
                    resultNumbers = "Four";
                    break;
                case 5:
                    resultNumbers = "Five";
                    break;
                case 6:
                    resultNumbers = "Six";
                    break;
                case 7:
                    resultNumbers = "Seven";
                    break;
                case 8:
                    resultNumbers = "Eight";
                    break;
                case 9:
                    resultNumbers = "Nine";
                    break;

            }
            System.out.println(resultTenNumber + " " + resultNumbers);
        }


        int hundredNumber = number / 100;
//        int tenNumbers1=number-100;
        int tenNumbers = number % 100;

        int tenNumbers1 = tenNumbers / 10;
        int numberses = tenNumbers % 10;

        String resultHundredNumber = "";
        String resultTenNumbers1 = "";
        String resultNumberses = "";



        if (number >= 100 && number <= 999) {
            switch (hundredNumber) {
                case 1:
                    resultHundredNumber = "One hundred and ";
                    break;
                case 2:
                    resultHundredNumber = "Two hundred and ";
                    break;
                case 3:
                    resultHundredNumber = "Three hundred and";
                    break;
                case 4:
                    resultHundredNumber = "Four hundred and";
                    break;
                case 5:
                    resultHundredNumber = "Five hundred and";
                    break;
                case 6:
                    resultHundredNumber = "Six hundred and";
                    break;
                case 7:
                    resultHundredNumber = "Seven hundred and";
                    break;
                case 8:
                    resultHundredNumber = "Eight hundred and";
                    break;
                case 9:
                    resultHundredNumber = "Nine hundred and";
                    break;
            }
            if (tenNumbers >= 10 && tenNumbers < 20)
                switch (tenNumbers1) {
                    case 10:
                        resultTenNumbers1 = "Ten";
                        break;
                    case 11:
                        resultTenNumbers1 = "Eleven";
                        break;
                    case 12:
                        resultTenNumbers1 = "Twelve";
                        break;
                    case 13:
                        resultTenNumbers1 = "Thirteen";
                        break;
                    case 14:
                        resultTenNumbers1 = "Fourteen";
                        break;
                    case 15:
                        resultTenNumbers1 = "Fifteen";
                        break;
                    case 16:
                        resultTenNumbers1 = "Sixteen";
                        break;
                    case 17:
                        resultTenNumbers1 = "Seventeen";
                        break;
                    case 18:
                        resultTenNumbers1 = "Eighteen";
                        break;
                    case 19:
                        resultTenNumbers1 = "Nineteen";
                        break;
                }
            else if (tenNumbers >= 20 && tenNumbers <= 99) {

                switch (tenNumbers1) {
                    case 2:
                        resultTenNumbers1 = "Twenty";
                        break;
                    case 3:
                        resultTenNumbers1 = "Thirty";
                        break;
                    case 4:
                        resultTenNumbers1 = "Forty";
                        break;
                    case 5:
                        resultTenNumbers1 = "Fifty";
                        break;
                    case 6:
                        resultTenNumbers1 = "Sixty";
                        break;
                    case 7:
                        resultTenNumbers1 = "Seventy";
                        break;
                    case 8:
                        resultTenNumbers1 = "Eighty";
                        break;
                    case 9:
                        resultTenNumbers1 = "Ninety";
                        break;
                }

            }
            switch (numberses) {
                case 1:
                    resultNumberses = "One";
                    break;
                case 2:
                    resultNumberses = "Two";
                    break;
                case 3:
                    resultNumberses = "Three";
                    break;
                case 4:
                    resultNumberses = "Four";
                    break;
                case 5:
                    resultNumberses = "Five";
                    break;
                case 6:
                    resultNumberses = "Six";
                    break;
                case 7:
                    resultNumberses = "Seven";
                    break;
                case 8:
                    resultNumberses = "Eight";
                    break;
                case 9:
                    resultNumberses = "Nine";
                    break;

            }


        }
        System.out.println(resultHundredNumber +" " + resultTenNumbers1 + " " + resultNumberses);
    }
}