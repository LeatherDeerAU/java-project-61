package hexlet.code.games;

import hexlet.code.Card;

import static hexlet.code.App.QUESTION_COUNT;
import static hexlet.code.common.Util.random;
import java.util.ArrayList;
import java.util.List;

public class IsPrimeGame {
    public static void run() {
        String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        List<Card> quizCards = new ArrayList<>();

        for (int i = 0; i < QUESTION_COUNT; i++) {
            int number = random.nextInt(101);
            String question = String.valueOf(number);
            String answer = isPrime(number) ? "yes" : "no";

            quizCards.add(new Card(question, answer));
        }

        BaseGame.start(quizCards, task);
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}