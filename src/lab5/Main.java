package lab5;

import lab5.data.DataOfBet;
import lab5.entities.Pet;
import lab5.service.PetService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        PetService petService = new PetService();
        ArrayList<Pet> pets = new ArrayList<>();
        DataOfBet dataPet = new DataOfBet();
        dataPet.createListPet(pets);
        Pet pet = petService.setInfoPet(scanner);
        petService.questionYesNo(pet,pets);
    }
}
