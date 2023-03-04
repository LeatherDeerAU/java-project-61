package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenCheckGame {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int correctCount = 0;
        while (correctCount < 3) {
            int curNum = random.nextInt(1, 100);
            System.out.println("Question: " + curNum);

            String expectedAnswer = (curNum % 2 == 0) ? "yes" : "no";

            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (expectedAnswer.equals(userAnswer)) {
                System.out.println("Correct!");
                correctCount += 1;
            } else {
                System.out.printf("'%s' is wrong answer :( Correct answer was '%s'\n", userAnswer, expectedAnswer);
                System.out.printf("Let's try again, %s!\n", name);
                break;
            }
        }

        if (correctCount == 3) {
            System.out.printf("Congratulations, %s!\n", name);
        }
    }
}
