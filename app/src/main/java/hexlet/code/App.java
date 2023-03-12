package hexlet.code;

import hexlet.code.common.Util;
import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenCheckGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.IsPrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static final int QUESTION_COUNT = 3;
    public static void main(String[] args) {
        Scanner scanner = Util.getScanner();

        System.out.println("Welcome to the Brain Games!");
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Check
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """.trim());

        System.out.print("Your choice: ");
        String userChoise = scanner.next();

        System.out.println();

        switch (userChoise) {
            case "6" -> IsPrimeGame.run();
            case "5" -> ProgressionGame.run();
            case "4" -> GcdGame.run();
            case "3" -> CalcGame.run();
            case "2" -> EvenCheckGame.run();
            case "1" -> Util.greetingAndGetUserName();
            case "0" -> System.out.println("Exit.");
            default -> System.out.println("Enter correct number.");
        }

        scanner.close();
    }
}
