package lab2.service;

import lab2.entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    Scanner scanner = new Scanner(System.in);
    List<Student> arrStu = new ArrayList<>();
    List<Student> rankA = new ArrayList<>();
    List<Student> rankB = new ArrayList<>();
    List<Student> rankC = new ArrayList<>();

    public double setAvgScore(double scoreM, double scoreP, double scoreC){
        return (scoreM+scoreC+scoreP)/3;
    }
    public Student scoreOfStudent ( ){
        int count = 0;
        String name="";
        double scoreM = 0;
        double scoreC = 0;
        double scoreP = 0;
        System.out.println("Mời bạn nhập số học sinh của lớp:");
        int numberOfStudent= Integer.parseInt(scanner.nextLine());
        do {
            this.setStudent(scanner);
            count++;

        }while (count<numberOfStudent);
        System.out.println(arrStu);
        return new Student(name,setAvgScore(scoreM,scoreC,scoreP));
    }
    public void setStudent(Scanner scanner){
        System.out.println("Enter name: ");
        String name = this.scanner.nextLine();
        System.out.println("Enter score of Math: ");
        double scoreMath = Double.parseDouble(this.scanner.nextLine());
        System.out.println("Enter score of Physic: ");
        double scorePhysic = Double.parseDouble(this.scanner.nextLine());
        System.out.println("Enter score of Chemistry: ");
        double scoreChemistry = Double.parseDouble(this.scanner.nextLine());
        Student student = new Student(name,setAvgScore(scoreMath,scoreChemistry,scorePhysic));
        arrStu.add(student);
    }
    public void rankStudent(String name, double scoreM, double scoreC, double scoreP
    ){
        Student student = new Student(name,setAvgScore(scoreM,scoreC,scoreP));
        if (setAvgScore(scoreM,scoreC,scoreP)>=8){
            System.out.println("rank A");
            rankA.add(student);
        } else if (setAvgScore(scoreM, scoreC, scoreP) < 8&&setAvgScore(scoreM,scoreC,scoreP)>=6.5) {
            System.out.println("rank B");
            rankB.add(student);
        } else System.out.println("rank C");
        rankC.add(student);
        System.out.println("Phần trăm rank A là: "+rankA.size()/arrStu.size()*100);
        System.out.println("Phần trăm rank B là: "+rankB.size()/arrStu.size()*100);
        System.out.println("Phần trăm rank C là: "+rankC.size()/arrStu.size()*100);

    }
}
