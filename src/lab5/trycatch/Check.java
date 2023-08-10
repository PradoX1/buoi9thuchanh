package lab5.trycatch;
import lab5.util.Type;

import java.util.Locale;
import java.util.Scanner;
public class Check {
    public int checkAge(Scanner scanner){
        do {
            System.out.println("Nhập tuổi: ");
            try {
                int age = Integer.parseInt(scanner.nextLine());
                if (age > 0){
                    return age;
                }else {
                    System.out.println("Nhập lại tuổi!");
                }
            }catch (Exception e){
                System.out.println("Mời bạn nhập lại!");
            }
        } while (true);
    }
    public Type checkType(Scanner scanner){
        do {
            System.out.println("Nhập loại pet: ");
            try {
                Type type = Type.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
                if (type.equals(Type.DOG) || type.equals(Type.CAT)){
                    return type;
                }else {
                    System.out.println("Nhập lại type!");
                }
            }catch (Exception e){
                System.out.println("Mời bạn nhập lại!");
            }
        } while (true);
    }
}
