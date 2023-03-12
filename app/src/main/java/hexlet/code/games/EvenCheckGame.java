package hexlet.code.games;

import hexlet.code.Card;

import static hexlet.code.common.Util.QUESTION_COUNT;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EvenCheckGame {
    public static void run() {
        Random random = new Random();

        List<Card> cards = new ArrayList<>();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < QUESTION_COUNT; i++) {
            int curNum = random.nextInt(1, 100);

            String question = String.valueOf(curNum);
            String expectedAnswer = (curNum % 2 == 0) ? "yes" : "no";

            cards.add(new Card(question, expectedAnswer));
        }

        BaseGame.start(cards);
    }
}
