import java.util.Random;

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

    public String getSound() {
        System.out.println(name + " Hau Hau");
        return name + " Hau Hau";
    }

    public String toString() {
        return "Imie: " + name + "\tRasa: " + getBreedType() + "\tZjada dziennie: " + howMuchEatPerDay;
    }
}