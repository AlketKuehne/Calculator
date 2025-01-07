# JavaCodespace
# Problem
Write a complete Java program that asks the user to enter a numerator and a denominator of a fraction from the keyboard. Output the fraction and resulting fraction as a decimal to the keyboard.

Here is an example of how your program is to work:

Enter Numerator: 4
Enter Denominator: 2

4/2 = 2
Is the following solution correct? Why or why not?

import java.util.Scanner;

public class Fraction {
  public static void main (String[] args) {
    Scanner scanner = new Scanner (System.in);
    int numerator, denominator, result;
    
    System.out.print ("Enter Numerator: ");
    numerator = scanner.nextInt ();
    System.out.print ("Enter Denominator: ");
    denominator = scanner.nextInt ();
    System.out.println ();
    
    result = numerator / denominator;
    
    System.out.println (numerator + "/" + denominator + " = " + result);
  }
}