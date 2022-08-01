package exercises789.throwThrows;

import java.util.Scanner;

public class ThrowsMain {
    public static void main(String[] args) {
        dividePorCero();
    }
    public static void dividePorCero() throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        try {
            int result = number1 / number2;
            System.out.println("\nThe result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("This can't be done.");
        }
        finally {
            System.out.println("Demo de codigo");
        }
    }
}