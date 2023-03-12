package hexlet.code.games;

import hexlet.code.Card;

import static hexlet.code.common.Util.QUESTION_COUNT;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CalcGame {
    static String[] operation = {"+", "*"};

    public static void run() {
        Random random = new Random();

        List<Card> cards = new ArrayList<>();

        for (int i = 0; i < QUESTION_COUNT; i++) {
            int firstNum = random.nextInt(11);
            int secondNum = random.nextInt(11);
            String op = operation[random.nextInt(2)];

            String question = String.format("%d %s %d", firstNum, op, secondNum);
            String expectedAns;
            if ("+".equals(op)) {
                expectedAns = String.valueOf(firstNum + secondNum);
            } else {
                expectedAns = String.valueOf(firstNum * secondNum);
            }

            cards.add(new Card(question, expectedAns));
        }

        BaseGame.start(cards);
    }
}
