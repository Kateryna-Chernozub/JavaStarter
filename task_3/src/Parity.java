import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        System.out.println("Введіть число: ");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt ();

        if ((num & (num + 1)) == num) {
            System.out.println("Число " + num + " парне.");
        } else {
            System.out.println("Число " + num + " не парне.");
        }
    }
}
