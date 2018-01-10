import java.util.Random;

public class Cat extends Animal {

    private String color;
    private boolean isHungry;

    public Cat(String name, String color) {
        super(name);
        Random rand = new Random();
        howMuchEatPerDay = rand.nextInt(2) + 7;
        this.color = color;
        isHungry = true;
    }

    public String getSound() {
        System.out.println(name + " Miau Miau");
        return name + " Miau Miau";
    }

    public String drawColor() {
        String hex1 = color.substring(1, 3);
        int decimal1 = Integer.parseInt(hex1, 16);
        String hex2 = color.substring(3, 5);
        int decimal2 = Integer.parseInt(hex2, 16);
        String hex3 = color.substring(5);
        int decimal3 = Integer.parseInt(hex3, 16);
        return "R:" + decimal1 + " G:" + decimal2 + " B:" + decimal3;
    }

    public String toString() {
        return "Imie: " + name + "\tkolor#: " + color + " kolor RGB: " + drawColor() + "\tZjada dziennie: " + howMuchEatPerDay;
    }


}
