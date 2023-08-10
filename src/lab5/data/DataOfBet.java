package lab5.data;

import lab5.entities.Pet;
import lab5.util.Type;

import java.util.ArrayList;

public class DataOfBet {
    public ArrayList<Pet> createListPet(ArrayList<Pet> pets){
        Pet pet1 = new Pet("Ki","Nhật Bản",2,"male","Shiba-inu", Type.DOG,"images.png");
        Pet pet2 = new Pet("Cacao","Nga",2,"female","Abanai",Type.DOG,"images.png");
        Pet pet3 = new Pet("Vàng","Việt Nam",2,"male","Chó cỏ",Type.DOG,"images.png");
        Pet pet4 = new Pet("Kun","Anh Quốc",2,"female","Mèo anh chân ngắn",Type.CAT,"images.png");
        Pet pet5 = new Pet("Sushi","Nhật Bản",2,"male","Mèo tam thể",Type.CAT,"images.png");
        Pet pet6 = new Pet("Luna","Mỹ",2,"female","Mèo không lông",Type.CAT,"images.png");

        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);
        pets.add(pet5);
        pets.add(pet6);
        return pets;
    }
}
