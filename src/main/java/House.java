import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

public class House {

    private static Scanner in = new Scanner(System.in);
    private Random rand = new Random();
    private int petFood = rand.nextInt(1001) + 500;
    private int dailyFood = 0;
    private int catFood = 0;
    private int dogFood = 0;
    private int lackOfFood;

    public void tryToGuess(List<Animal> animals, int dogsAmount, int catsAmount) {

        divideFood(animals);
        guessHowManyDays(lackOfFood);
        showStats(animals, dogsAmount, catsAmount, catFood, dogFood, dailyFood, lackOfFood);
    }

    private void divideFood(List<Animal> animals) {
        for (Animal a : animals) {
            dailyFood += a.howMuchEatPerDay;
            if (a instanceof Dog) dogFood += a.howMuchEatPerDay;
            else catFood += a.howMuchEatPerDay;
        }
        lackOfFood = petFood / dailyFood + 1;
    }

    private void showStats(List<Animal> animals, int dogsAmount, int catsAmount, int catFood, int dogFood, int dailyFood, int lackOfFood) {
        for (Animal a : animals) {
            if (a instanceof Dog) {
                System.out.println(a);
            } else {
                System.out.println(a);
            }
        }
        System.out.println("Liczba zwierzat: " + (dogsAmount + catsAmount));
        System.out.println("Liczba psow: " + dogsAmount);
        System.out.println("Liczba kotow: " + catsAmount);
        System.out.println("Dzienne spozycie kotow: " + catFood);
        System.out.println("Dzienne spozycie psow: " + dogFood);
        System.out.println("Dzienne spozycie zwierzat: " + dailyFood);
        BreedCounter breedCounter = new BreedCounter();
        breedCounter.getCount();
        System.out.println("W domu bylo " + petFood + " jedzenia");
        System.out.println("Karma sie skonczyla po: " + lackOfFood);
    }

    private void guessHowManyDays(int lackOfFood) {
        System.out.println("Zgadnij po ilu dniach skonczy sie jedzenie");
        boolean goodAnswer = false;
        do {
            int answer = in.nextInt();
            if (answer == lackOfFood) {
                System.out.println("Brawo zgadles!");
                goodAnswer = true;
            } else if (answer < lackOfFood) {
                System.out.println("Troche wiecej");
            } else {
                System.out.println("Troche mniej");
            }
        } while (!goodAnswer);
    }

    public void addCats(int catsAmount, List<Animal> animals) {
        for (int i = 0; i < catsAmount; i++) {
            System.out.println("Kot nr " + (i + 1));
            System.out.print("Imie: ");
            String name = Utils.validName(in.nextLine());
            System.out.print("Kolor HEX: ");
            String color = Utils.validColor();
            Cat cat = new Cat(name, color);
            animals.add(cat);
        }
    }

    public void addDogs(int dogsAmount, List<Animal> animals) {
        for (int i = 0; i < dogsAmount; i++) {
            System.out.println("Pies nr " + (i + 1));
            System.out.print("Imie oraz rasa: ");
            String nameAndBreed = Utils.validNameAndBreed();
            String[] parts = nameAndBreed.split(" ");
            String name = Utils.validName(parts[0]);
            BreedType breed = Utils.setBreedType(parts[1]);
            Dog dog = new Dog(name, breed);
            animals.add(dog);
        }
    }

    public void getAllSounds(List<Animal> animals) {
        for (Animal a : animals) {
            a.getSound();
        }
    }
}
