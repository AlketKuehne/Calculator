import java.util.Scanner;

public class Math {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        double number1, number2, result;
        
        System.out.print ("Enter Number: ");
        number1 = scanner.nextInt ();
        System.out.print ("Enter Number: ");
        number2 = scanner.nextInt ();
        System.out.println ();

        result = number1 / number2;

        System.out.println (number1 + "/" + number2 + " = " + result);
    }
}