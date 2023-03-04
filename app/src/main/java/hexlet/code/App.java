package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Check
                0 - Exit
                """.trim());

        System.out.print("Your choice: ");
        int userChoise = scanner.nextInt();

        System.out.println();
        if (userChoise == 2) {
            EvenCheckGame.run();
        } else if (userChoise == 1) {
            CLI.runGreeting();
        } else if (userChoise == 0) {
            System.out.println("Exit.");
        }
    }
}
