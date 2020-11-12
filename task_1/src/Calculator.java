import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double operand1 = 10, operand2 = 0;
        double sum = operand1 + operand2;
        double dif = operand1 - operand2;
        double mul = operand1 * operand2;
        double div = operand1 / operand2;

        System.out.println("Введіть арефметичну дію: +, -, * або / : ");
        Scanner in = new Scanner (System.in);
        String sing = in.next();
        switch (sing) {
            case "+": {
                System.out.println("Сума значень дорівнює: " + sum);
                break;
            }
            case "-": {
                System.out.println("Різниця значень дорівнює: " + dif);
                break;
            }
            case "*": {
                System.out.println("Множення значень дорівнює: " + mul);
                break;
            }
            case "/": {
                System.out.println("Ділення значень дорівнює: " + div);
                break;
            }
            default: {
                System.out.println("Операція не дійсна. Спробуйте знову.");
            }
        }
        if (operand2 == 0) {
            System.out.println("Ділення не можливе");
        }
    }
}
