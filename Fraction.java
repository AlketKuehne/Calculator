import java.util.Scanner;

public class Fraction {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int factor1, factor2, result;
        
        System.out.print ("Enter Factor: ");
        factor1 = scanner.nextInt ();
        System.out.print ("Enter Factor: ");
        factor2 = scanner.nextInt ();
        System.out.println ();

        result = factor1 * factor2;

        System.out.println (factor1 + "*" + factor2 + " = " + result);
    }
}