public class BreedCounter {

    private static int yorkCount = 0, bulldogCount = 0, huskyCount = 0, labradorCount = 0, dobermanCount = 0;
    private static int breedCount[] = {yorkCount, bulldogCount, huskyCount, labradorCount, dobermanCount};

    public void countBreed(String breedName) {
        if (breedName.equals("York")) breedCount[0]++;
        else if (breedName.equals("Bulldog")) breedCount[1]++;
        else if (breedName.equals("Doberman")) breedCount[2]++;
        else if (breedName.equals("Husky")) breedCount[3]++;
        else if (breedName.equals("Labrador")) breedCount[4]++;
    }

    public void getCount() {
        System.out.println("Psy poszczegolnych ras: ");
        System.out.println("York: " + breedCount[0]);
        System.out.println("Bulldog: " + breedCount[1]);
        System.out.println("Doberman: " + breedCount[2]);
        System.out.println("Husky: " + breedCount[3]);
        System.out.println("Labrador: " + breedCount[4]);
        System.out.println("Liczba roznych ras: " + differentBreeds());
    }

    public int differentBreeds() {
        int difBreeds = 0;
        for (int i = 0; i < breedCount.length; i++) {
            if (breedCount[i] > 0) difBreeds++;
        }
        return difBreeds;
    }

}
