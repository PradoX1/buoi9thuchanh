package lab3.view;

import lab3.entities.History;
import lab3.entities.Worker;
import lab3.service.WorkerService;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    WorkerService workerService = new WorkerService();
    ArrayList<Worker> workers = new ArrayList<>();
    ArrayList<History> historySalaries = new ArrayList<>();

    public void displayMenu() {
        System.out.println("WORKER MANAGEMENT");
        System.out.println("1- Add worker");
        System.out.println("2- Up salary");
        System.out.println("3- Down salary");
        System.out.println("4- Display Info");
        System.out.println("5- Exit!");

    }

    public int selectMenu(Scanner scanner) {
        do {
            this.displayMenu();
            System.out.println("Please choose: ");
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("try again!");
            }
        } while (true);
    }

    public void menuNav(Scanner scanner) {
        boolean count = true;
        do {
            int choose = this.selectMenu(scanner);
            switch (choose) {
                case 1:
                    Worker worker = workerService.createWorker(scanner);
                    workers.add(worker);
                    break;
                case 2:
                    workerService.updateSalary(scanner, workers, historySalaries);
                    break;
                case 3:
                    workerService.updateSalary(scanner, workers, historySalaries);
                    break;
                case 4:
                    workerService.displayInfor(historySalaries);
                    break;
                case 5:
                    count= false;
                    System.out.println("Thanks you!");
                    break;
            }
        } while (count);
    }
}
