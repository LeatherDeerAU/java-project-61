package hexlet.code.games;

import hexlet.code.Card;
import hexlet.code.common.Util;

import static hexlet.code.App.QUESTION_COUNT;
import static hexlet.code.common.Util.RANDOM;
import java.util.ArrayList;
import java.util.List;

public class GcdGame {
    private static final int RANDOM_BOUND = 101;

    public static void run() {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < QUESTION_COUNT; i++) {
            int firstNum = RANDOM.nextInt(RANDOM_BOUND);
            int secondNum = RANDOM.nextInt(RANDOM_BOUND);

            String question = String.format("%d %d", firstNum, secondNum);
            int gcd = Util.calculateGCD(firstNum, secondNum);
            String expectedAns = String.valueOf(gcd);

            cards.add(new Card(question, expectedAns));
        }

        String task = "Find the greatest common divisor of given numbers.";
        BaseGame.start(cards, task);
    }
}
