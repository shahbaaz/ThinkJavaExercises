package InputOutput;

import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);
        System.out.println("Print something: ");
        line = in.nextLine();
        System.out.println("You said: " + line);

        System.out.println("Print something else: ");
        line = in.nextLine();
        System.out.println("You also said: " + line);
    }
}
