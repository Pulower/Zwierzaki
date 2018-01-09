import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        House house = new House();
        List<Animal> animals = new ArrayList<>();
        System.out.println("Ile kotow chcesz dodac?");
        int catsAmount = Utils.validInt();
        house.addCats(catsAmount, animals);
        System.out.println("Ile psow chcesz dodac?");
        int dogsAmount = Utils.validInt();
        house.addDogs(dogsAmount, animals);

        while (true) {
            System.out.println("\na-Uslysz glos zwierzat");
            System.out.println("b-Gra w TryToGuess");
            System.out.println("c-Zakoncz program");
            String choose = in.next();
            switch (choose) {
                case "a": {
                    house.getAllSounds(animals);
                    break;
                }
                case "b": {
                    if (animals.isEmpty()) System.out.println("Brak zwierzat");
                    else house.tryToGuess(animals, dogsAmount, catsAmount);
                    break;
                }
                case "c": {
                    System.exit(0);
                }
                default: {
                    System.out.println("Niepoprawny wybor!");
                    break;
                }
            }
        }
    }
}