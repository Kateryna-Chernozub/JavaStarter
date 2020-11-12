import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        System.out.println("Введіть свій стаж роботи: ");
        Scanner sc = new Scanner (System.in);
        int work = sc.nextInt();
        if (work<5) System.out.println("Премія складає 10% від з.п.");
        if (work>=5 & work<10) System.out.println("Премія складає 15% від з.п.");
        if (work>=10 & work<15) System.out.println("Премія складає 25% від з.п.");
        if (work>=15 & work<20) System.out.println("Премія складає 35% від з.п.");
        if (work>=20 & work<25) System.out.println("Премія складає 45% від з.п.");
        if (work>=25) System.out.println("Премія складає 50% від з.п.");
        }
    }

