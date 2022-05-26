package InputOutput;

import java.util.Scanner;


/**
 * A program to convert temperature from Celcius to Fahrenheit
 */
public class Ex3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Celcius: ");
        double temperatureInCelcius = scanner.nextDouble();
        double temperatureInFahrenheit = ((temperatureInCelcius * 9) / 5) + 32;
        System.out.printf("%.1f Celcius is %.1f Fahrenheit", temperatureInCelcius, temperatureInFahrenheit);
    }
}
