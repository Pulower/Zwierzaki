import java.util.Scanner;
import java.util.regex.Pattern;

public class Utils {

    private static Scanner in = new Scanner(System.in);
    private static Scanner scanner = new Scanner(System.in);

    public static int validInt() {
        while (!in.hasNextInt()) {
            System.out.println("Podaj liczbe calkowita!");
            in.next();
        }
        return in.nextInt();
    }

    public static String validName(String name) {
        while (!(Pattern.matches("^[A-Z].[a-z]*", name))) {
            System.out.println("Niepoprawna nazwa! Podaj nazwe z duzej litery.");
            name = in.next();
        }
        return name;
    }

    public static String validColor() {
        String color = in.next();
        while (!(Pattern.matches("^[#][0-9A-Fa-f]{6}", color))) {
            System.out.println("Niepoprawny kolor! Podaj kolor w formacie HEX (np #123def)");
            color = in.next();
        }
        return color;
    }

    public static BreedType setBreedType(String breedName) {
        while (true) {
            breedName = breedName.toLowerCase();
            char first = breedName.charAt(0);
            first -= 32;
            breedName = breedName.replace(breedName.charAt(0), first);

            switch (breedName) {
                case "York":
                case "Bulldog":
                case "Doberman":
                case "Husky":
                case "Labrador": {
                    return countAndSet(breedName);
                }
                default: {
                    System.out.println("Niepoprawna rasa!");
                    breedName = in.next();
                }
            }
        }
    }

    private static BreedType countAndSet(String breedName) {
        BreedCounter breedCounter = new BreedCounter();
        breedCounter.countBreed(breedName);
        BreedType breed = BreedType.valueOf(breedName);
        return breed;
    }

    public static String validNameAndBreed() {
        String nameAndBreed = scanner.nextLine();
        while (!(nameAndBreed.matches(".+\\s.+"))) {
            System.out.println("Podaj imie i rase oddzielone spacja");
            nameAndBreed = scanner.nextLine();
        }
        return nameAndBreed;
    }
}
