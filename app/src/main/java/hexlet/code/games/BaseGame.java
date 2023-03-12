package hexlet.code.games;

import hexlet.code.Card;
import hexlet.code.common.Util;

import static hexlet.code.common.Util.scanner;
import java.util.List;

public class BaseGame {
    public static void start(List<Card> cards, String task) {
        String name = Util.greetingAndGetUserName();

        System.out.println(task);

        int correctCount = 0;
        for (Card card : cards) {
            System.out.println("Question: " + card.getQuestion());

            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (card.getExpectedAnswer().equals(userAnswer)) {
                System.out.println("Correct!");
                correctCount += 1;
            } else {
                System.out.printf("'%s' is wrong answer :( Correct answer was '%s'\n",
                        userAnswer,
                        card.getExpectedAnswer());

                break;
            }
        }

        if (correctCount == cards.size()) {
            System.out.printf("Congratulations, %s!\n", name);
        } else {
            System.out.printf("Let's try again, %s!\n", name);
        }
    }
}
