package hexlet.code;

import hexlet.code.common.Util;
import hexlet.code.game.CalcGame;
import hexlet.code.game.EvenCheckGame;
import hexlet.code.game.GcdGame;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Check
                3 - Calc
                4 - GCD
                0 - Exit
                """.trim());

        System.out.print("Your choice: ");
        int userChoise = scanner.nextInt();

        System.out.println();
        if (userChoise == 4) {
            GcdGame.run();
        } else if (userChoise == 3) {
            CalcGame.run();
        } else if (userChoise == 2) {
            EvenCheckGame.run();
        } else if (userChoise == 1) {
            Util.greetingAndGetUserName();
        } else if (userChoise == 0) {
            System.out.println("Exit.");
        }

        scanner.close();
    }
}
