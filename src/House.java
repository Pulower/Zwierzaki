import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

public class House {

    static Scanner in = new Scanner(System.in);
    Random rand = new Random();
    int petFood = rand.nextInt(1001) + 500;

    public void tryToGuess(List<Animal> animals, int dogsAmount, int catsAmount) {
        int dailyFood = 0;
        int catFood = 0;
        int dogFood = 0;
        for (Animal a : animals) {
            dailyFood += a.howMuchEatPerDay;
            if (a instanceof Dog) dogFood += a.howMuchEatPerDay;
            else catFood += a.howMuchEatPerDay;
        }
        int lackOfFood = petFood / dailyFood + 1;
        boolean goodAnswer = false;
        System.out.println("Zgadnij po ilu dniach skonczy sie jedzenie");

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

    public void addCats(int catsAmount, List<Animal> animals) {
        for (int i = 0; i < catsAmount; i++) {
            System.out.println("Kot nr " + (i + 1));
            System.out.print("Imie: ");
            String name = in.next();
            System.out.print("Kolor: ");
            String color = in.next();
            Cat cat = setCatName(name, color);
            animals.add(cat);
        }
    }

    public Cat setCatName(String catName, String catColor) {
        while (!(Pattern.matches("^[A-Z].[a-z]*", catName)) || !(Pattern.matches("^[#][0-9A-F]{6}", catColor))) {
            System.out.println("Niepoprawna nazwa lub kolor");
            System.out.print("Imie: ");
            catName = in.next();
            System.out.print("Kolor: ");
            catColor = in.next();
        }

        return new Cat(catName, catColor);
    }

    public void addDogs(int dogsAmount, List<Animal> animals) {
        for (int i = 0; i < dogsAmount; i++) {
            System.out.println("Pies nr " + (i + 1));
            System.out.print("Imie oraz rasa: ");
            String name = in.next();
            String breed = in.next();
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
