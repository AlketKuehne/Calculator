import java.util.Scanner;

public class GeneralCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2, result = 0;
        char operator;

        System.out.print("Enter first number: ");
        number1 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        number2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }

        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    }
}