package hexlet.code.games;

import hexlet.code.Card;
import hexlet.code.common.Util;

import static hexlet.code.App.QUESTION_COUNT;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CalcGame {
    private static final String[] OPERATIONS = {"+", "*"};
    private static final int RANDOM_BOUND = 11;

    public static void run() {
        List<Card> cards = new ArrayList<>();
        Random random = Util.getRandom();

        for (int i = 0; i < QUESTION_COUNT; i++) {
            int firstNum = random.nextInt(RANDOM_BOUND);
            int secondNum = random.nextInt(RANDOM_BOUND);
            String op = OPERATIONS[random.nextInt(OPERATIONS.length)];

            String question = String.format("%d %s %d", firstNum, op, secondNum);
            String expectedAns;
            if ("+".equals(op)) {
                expectedAns = String.valueOf(firstNum + secondNum);
            } else {
                expectedAns = String.valueOf(firstNum * secondNum);
            }

            cards.add(new Card(question, expectedAns));
        }

        String task = "What is the result of the expression?";
        BaseGame.start(cards, task);
    }
}
