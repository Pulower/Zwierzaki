import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Dog extends Animal {

    private BreedType breed;

    public Dog(String name, BreedType breed) {
        super(name);
        this.breed = breed;
        howMuchEatPerDay = new Random().nextInt(8) + 8;
    }

    public BreedType getBreedType() {
        return breed;
    }

    public void getSound() {
        System.out.println(name + " Hau Hau");
    }

    public String toString() {
        return "Imie: " + name + "\tRasa: " + getBreedType() + "\tZjada dziennie: " + howMuchEatPerDay;
    }
}