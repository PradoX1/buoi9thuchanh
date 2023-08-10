package lab3.trycatch;

import java.util.Scanner;
public class TryCatch {
    public int tryAge(Scanner scanner){
        do {
            System.out.println("Mời bạn nhập tuổi : ");
            try {
                int age = Integer.parseInt(scanner.nextLine());
                if (age >= 18){
                    return age;
                }else {
                    System.out.println("Nhập lại tuổi!");
                }
            }catch (Exception e){
                System.out.println("Mời bạn nhập lại!");
            }
        } while (true);
    }
    public double trySalary(Scanner scanner){
        do {
            System.out.println("Mời bạn nhập lương: ");
            try {
                double salary = Double.parseDouble(scanner.nextLine());
                if (salary > 0){
                    return salary;
                }else {
                    System.out.println("Nhập lại lương!");
                }
            }catch (Exception e){
                System.out.println("Mời bạn nhập lại!");
            }
        } while (true);
    }public double tryNewSalary(Scanner scanner){
        boolean isFalse = false;
        double newSalary = 0;
        do {
            System.out.println("Mời bạn nhập lương mong muốn : ");
            try {
                newSalary = Double.parseDouble(scanner.nextLine());
                if (newSalary != 0){
                    return newSalary;
                }else isFalse = true;
            }catch (Exception e){
                System.out.println("Mời bạn nhập lại!");
            }
        } while (!isFalse);
        return newSalary;
    }
}
