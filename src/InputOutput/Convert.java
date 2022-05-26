package InputOutput;

import java.util.Scanner;

/**
 * Converts centimeters to feet and inches.
 */
public class Convert {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;
        double cm;
        int feet, inches, remainder;
        Scanner in = new Scanner(System.in);

        // Prompt the user and get the value
        System.out.println("Exactly how many cm? ");
        cm = in.nextDouble();

        // Convert and output the result
        inches = (int) (cm / CM_PER_INCH);
        feet = inches / IN_PER_FOOT;
        remainder = inches % IN_PER_FOOT;
        System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
    }
}
