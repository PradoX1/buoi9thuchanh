package lab3.service;

import lab3.entities.History;
import lab3.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;
import lab3.trycatch.TryCatch;

public class WorkerService {
    TryCatch tryCatch = new TryCatch();
    public Worker createWorker(Scanner scanner) {

        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        int age = tryCatch.tryAge(scanner);
        System.out.println("Mời bạn nhập nơi làm việc: ");
        String workPlace = scanner.nextLine();
        double salary = tryCatch.trySalary(scanner);
        return new Worker(name,age,salary,workPlace);
    }
    public ArrayList<History> updateSalary(Scanner scanner,ArrayList<Worker> workers,ArrayList<History> historySalaries){
        do {
            System.out.println("Mời bạn nhập Id: ");
            String searchID = scanner.nextLine();
            System.out.println("Cập nhật lương: ");
             double newSalary = tryCatch.tryNewSalary(scanner);
            for (Worker worker : workers){
                do {
                    if (!worker.getId().equals(searchID)){
                        System.out.println("Không có id này!");
                        break;
                    }else {
                        worker.setSalary(worker.getSalary() + newSalary);
                        History historySalary;
                        if (newSalary > 0){
                            historySalary = new History(worker,"Lương bạn đã được tăng!");
                            historySalaries.add(historySalary);
                        }else{
                            historySalary = new History(worker,"Lương bạn đã bị giảm!");
                            historySalaries.add(historySalary);
                        }
                    }
                }while (!worker.getId().equals(searchID));
            }
            return historySalaries;
        } while (true);
    }
    public void displayInfor(ArrayList<History> historySalaries){
        System.out.println(historySalaries);
    }
}
