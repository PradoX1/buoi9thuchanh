package lab3;

import lab3.entities.Worker;
import lab3.service.WorkerService;
import lab3.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.menuNav(scanner);
    }
}

