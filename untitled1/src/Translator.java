import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        System.out.println("Введіть слово англійською мовою: ");
        Scanner in = new Scanner(System.in);
        String word = in.next();
        switch (word) {
            case "apple": System.out.print(" - яблуко");
                break;
            case "book": {
                System.out.println(" - книга");
                break;
            }
            case "cycle": {
                System.out.println(" - велосипед");
                break;
            }
            case "door": {
                System.out.println(" - двеві");
                break;
            }
            case "enjoy": {
                System.out.println(" - насолоджуванися");
                break;
            }
            default: {
                System.out.println("Дане слово відсутнє.");
                break;
            }
        }
    }
}
