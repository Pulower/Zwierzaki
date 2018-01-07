import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Dog extends Animal {

    Scanner in = new Scanner(System.in);

    BreedType breed;

    public Dog(String name, String breed) {
        super(name);
        setBreedType(breed);
        while (!(Pattern.matches("^[A-Z].[a-z]*", this.name)) || this.breed.equals(null)) {
            System.out.println("Wprowadz poprawna nazwe oraz rase");
            this.name = in.next();
            setBreedType(in.next());
        }
        howMuchEatPerDay = new Random().nextInt(8) + 8;
    }

    public void setBreedType(String breedName) {
        while (true) {
            breedName = breedName.toLowerCase();
            char first = breedName.charAt(0);
            first -= 32;
            breedName = breedName.replace(breedName.charAt(0), first);
            if (breedName.equals("York") || breedName.equals("Bulldog") || breedName.equals("Doberman") || breedName.equals("Husky") || breedName.equals("Labrador")) {
                BreedCounter breedCounter = new BreedCounter();
                breedCounter.countBreed(breedName);
                breed = BreedType.valueOf(breedName);
                break;
            } else {
                System.out.println("Niepoprawna rasa!");
                breedName = in.next();
            }
        }
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