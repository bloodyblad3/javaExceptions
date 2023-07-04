import java.util.Scanner;

public class FractionInput {
    public static void main(String[] args) {
        float number = readFraction();
        System.out.println("Введенное число: " + number);
    }

    public static float readFraction() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();
            try {
                float number = Float.parseFloat(input);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат числа. Попробуйте снова.");
            }
        }
    }
}