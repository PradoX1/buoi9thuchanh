package lab5.service;

import lab5.trycatch.Check;
import lab5.entities.Pet;
import lab5.util.Type;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class PetService {
    Check check = new Check();
    public Pet setInfoPet(Scanner sc){
        System.out.println("Chào mừng đến với chương trình phối giống thú cưng!!!");
        System.out.println("Nhập tên thú cưng của bạn: ");
        String name = sc.nextLine();
        System.out.println("Nhập giống loài: ");
        String species = sc.nextLine();
        int age = check.checkAge(sc);
        System.out.println("Nhập giới tính: ");
        String sex = sc.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("Nhập mô tả: ");
        String description = sc.nextLine();
        System.out.println("Nhập type: ");
        Type type = check.checkType(sc);
        System.out.println("Nhập images: ");
        String images = sc.nextLine();
        return new Pet(name,species,age,sex,description,type,images);
    }
    public ArrayList<Pet> getSamePet(Pet pet,ArrayList<Pet> pets){
        ArrayList<Pet> petsMatch = new ArrayList<>();
        for (Pet pet1 : pets){
            if (pet1.getType().equals(pet.getType()) && !pet1.getSex().equals(pet.getSex())){
                petsMatch.add(pet1);
            }
        }
        System.out.println(petsMatch);
        return petsMatch;

    }
    public void questionYesNo(Pet pet,ArrayList<Pet> pets){
        Scanner scanner = new Scanner(System.in);
        boolean count = true;
        do {
            this.getSamePet(pet,pets);
            System.out.println("Bạn có muốn tìm pet khác không ? : Y/N");
            String choice = scanner.nextLine().toLowerCase(Locale.ROOT);
            switch (choice){
                case "y":
                    count =true;
                    this.getSamePet(pet,pets);
                    break;
                case "n":
                    count= false;
                    break;
            }
        }while (count);

    }
}
