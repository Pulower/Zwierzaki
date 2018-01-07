public abstract class Animal {

    protected String name;
    protected int howMuchEatPerDay;

    public Animal(String name) {
        this.name = name;

    }

    public int eat(int amountOfFood) {
        return amountOfFood - howMuchEatPerDay;
    }

    public void getSound() {
    }

    ;

}
