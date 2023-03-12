package hexlet.code.games;

import hexlet.code.Card;

import static hexlet.code.App.QUESTION_COUNT;
import static hexlet.code.common.Util.random;
import java.util.ArrayList;
import java.util.List;

public class EvenCheckGame {
    public static void run() {
        List<Card> cards = new ArrayList<>();

        for (int i = 0; i < QUESTION_COUNT; i++) {
            int curNum = random.nextInt(1, 100);

            String question = String.valueOf(curNum);
            String expectedAnswer = (curNum % 2 == 0) ? "yes" : "no";

            cards.add(new Card(question, expectedAnswer));
        }

        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        BaseGame.start(cards, task);
    }
}
