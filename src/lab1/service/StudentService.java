package lab1.service;

import lab1.entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class StudentService {
    public Student infoStudent(Scanner scanner){
        List<Student> arrStudent = new ArrayList<>();
        boolean yn = true;
        String name="";
        String address="";
        do {
            System.out.println("Mời bạn nhập tên học sinh: ");
            String nameS = scanner.nextLine();
            System.out.println("Mời bạn nhập địa chỉ của học sinh: ");
            String addressS= scanner.nextLine();
            Student student = new Student(nameS, addressS);
            arrStudent.add(student);
            System.out.println("Bạn muốn nhập tiếp không Y/N: ");
            String choice = scanner.nextLine().toLowerCase(Locale.ROOT);
            switch (choice){
                case "y":
                    yn =true;
                    break;
                case "n":
                    yn= false;
                    System.out.println("Cảm ơn bạn đã sử dụng!!! ");
            }
        }while (yn);
        System.out.println(arrStudent);
        return new Student(name,address);
    }
}
