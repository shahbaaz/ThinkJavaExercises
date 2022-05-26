package InputOutput;

import java.util.Scanner;

/**
 * A program to divide a number of seconds to hours, minutes and seconds
 */
public class Ex3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of seconds: ");
        int totalSeconds = scanner.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds - (hours * 3600)) / 60;
        int seconds = (totalSeconds - (hours * 3600) - (minutes * 60));

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", totalSeconds, hours, minutes, seconds);

    }
}
