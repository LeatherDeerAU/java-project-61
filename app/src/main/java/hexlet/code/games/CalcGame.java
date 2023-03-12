package hexlet.code.games;

import hexlet.code.Card;

import static hexlet.code.App.QUESTION_COUNT;
import static hexlet.code.common.Util.random;
import java.util.ArrayList;
import java.util.List;

public class CalcGame {
    static String[] operation = {"+", "*"};

    public static void run() {
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

        String task = "What is the result of the expression?";
        BaseGame.start(cards, task);
    }
}
