package hexlet.code.game;

import hexlet.code.Card;
import hexlet.code.common.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GcdGame {
    public static void run() {
        System.out.println("Find the greatest common divisor of given numbers.");

        Random random = new Random();
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < Util.QUESTION_COUNT; i++) {
            int firstNum = random.nextInt(101);
            int secondNum = random.nextInt(101);

            String question = String.format("%d %d", firstNum, secondNum);
            int gcd = Util.calculateGCD(firstNum, secondNum);
            String expectedAns = String.valueOf(gcd);

            cards.add(new Card(question, expectedAns));
        }

        BaseGame.start(cards);
    }
}
