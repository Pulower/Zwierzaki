import java.util.Scanner;

public class Utils {

    static Scanner in = new Scanner(System.in);

    public static int validInt() {
        while (!in.hasNextInt()) {
            System.out.println("Podaj liczbe calkowita!");
            in.next();
        }
        return in.nextInt();
    }
}
