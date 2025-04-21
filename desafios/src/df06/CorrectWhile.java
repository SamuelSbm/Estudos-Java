package df06;

import java.util.Random;
import java.util.Scanner;

public class CorrectWhile{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    boolean isBothNumbersNotEquals = true;

    while (isBothNumbersNotEquals) {
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int randomNumber = rand.nextInt(10);

        // number = 3
        // randomNumber = 2
        // isBothNumbersNotEquals = 3 != 2 == true
        isBothNumbersNotEquals = randomNumber != number;
        if(!isBothNumbersNotEquals) {
            System.out.println("You guessed it right!");
        } else {
            System.out.println("You guessed it wrong! The number was: " + randomNumber);
        }
    }
}
}