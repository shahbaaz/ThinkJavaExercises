package InputOutput;

import java.util.Random;
import java.util.Scanner;

/**
 * A guessing game
 */
public class Ex3_4 {
    public static void main(String[] args) {
        // Pick a random number

        Random random = new Random();
        int myNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("I am thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        int yourNumber = scanner.nextInt();
        System.out.println("Your guess is: " + yourNumber);
        System.out.println("The number I was thinking of is: " + myNumber);
        System.out.println("You were off by: " + Math.abs(yourNumber - myNumber));
    }
}
