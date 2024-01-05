import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Employee []employees=new Employee[10];
        employees[0]=new FullTimeEmployee("1", "a", 18, "0988", "a@gmail", 1000000, 200000, 5000000);
        employees[1]=new FullTimeEmployee("2", "b", 19, "0987", "b@gmail", 1000000, 300000, 3000000);
        employees[2]=new FullTimeEmployee("3", "c", 20, "0989", "c@gmail", 1000000, 200000, 4000000);
        employees[3]=new FullTimeEmployee("4", "d", 21, "0986", "d@gmail", 2000000, 200000, 5000000);
        employees[4]=new FullTimeEmployee("5", "e", 22, "0985", "e@gmail", 3000000, 100000, 5000000);
        employees[5]=new PartTimeEmployee("6", "f", 23, "0964", "f@gmail", 20);
        employees[6]=new PartTimeEmployee("7", "g", 18, "0988", "a@gmail",21);
        employees[7]=new PartTimeEmployee("8", "h", 18, "0988", "a@gmail", 20);
        employees[8]=new PartTimeEmployee("9", "j", 18, "0988", "a@gmail", 23);
        employees[9]=new PartTimeEmployee("10", "k", 18, "0988", "a@gmail", 20);
    }
    private static double getAverage(Employee[] employee) {
        double total = 0;
        int count = 0;
        for (Employee employees : employee) {
            total += employees.getSalary();
            count++;
        }
        return total / count;

    int choice=scanner.nextInt();
     switch (choice) {
        case 0:
            System.exit(0);
        case 1:

            System.out.println("Lương trung bình nhân viên công ty là :" + getAverage(employee));
            break;
        case 2:

            System.out.println("Lương trung bình nhân viên fulltime là : " + getAverageFullTime());
            break;
        case 3:
            double avgPartTime = get(employee);
            System.out.println("Lương trung bình nhân viên parttime là : " + avgPartTime);
            break;
        case 4:
            double total = getTotalPartTime(employee);
            System.out.println("Tổng lương phải trả cho nhân viên parttime là : " + total);
            break;
        case 5:
            int count1 = getCountEmployee(employee);
            System.out.println("Số người có mức lương cao hơn mức lương trung bình toàn công ty là :" + count1);
            break;
        case 6:
            System.out.println("Tên nhân viên parttime la :");
            Scanner scanner1 = new Scanner(System.in);
            String name = scanner1.nextLine();
            int countName = getCount(employee, name);
            System.out.println("Số nhân viên partime có tên được nhập vào từ bàn phím là : " + countName);
            break;
    }


    private static double getAverage(Employee[] employee) {
        double total = 0;
        int count = 0;
        for (Employee employees : employee) {
            total += employees.getSalary();
            count++;
        }
        return total / count;
    }

    private static double getAverageFullTime(Employee[] employee) {
        double total = 0;
        int count = 0;
        for (Employee employees : employee) {
            if (employees instanceof EmployeeFullTime)
                total += employees.getSalary();
            count++;
        }
        return total / count;
    }}

    private static double getAveragePartTime(Employee[] employee){
            double total = 0;
            int count = 0;
            for (Employee employees : employee) {
                if (employees instanceof PartTimeEmployee) {
                    total += employees.getSalary();
                    count++;
                }
            }
            return total / count;
        }

    private static double getAverageFullTime(Employee[] employee) {
        double total = 0;
        int count = 0;
        for (Employee employees : employee) {
            if (employees instanceof FullTimeEmployee)
                total += employees.getSalary();
            count++;
        }
        return total / count;
    }

    private static double getAveragePartTime(Employee[] employees) {
        double total = 0;
        int count = 0;
        for (Employee employeess : employee) {
            if (employeess instanceof PartTimeEmployee ){
                total += employees.getSalary();
                count++;
            }
        }
        return total / count;
    }

    private static double getTotalPartTime(Employee[] employee) {
        double total = 0;
        for (Employee employees : employee) {
            if (employees instanceof PartTimeEmployee) {
                total += employees.getSalary();
            }
        }
        return total;
    }


    private static int getCountEmployee(Employee[] employee) {
        int count = 0;
        for (Employee employees : employee) {
            if (employees.getSalary() > getAverage(employee))
                count++;
        }
        return count;
    }

    private static int getCount(Employee[] employee, String name) {
        int count = 0;
        for (Employee employees : employee) {
            if (employees instanceof PartTimeEmployee && employees.getHoVaTen().equals(name))
                count++;
        }
        return count;
    }
}