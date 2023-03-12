package hexlet.code.games;

import hexlet.code.Card;

import static hexlet.code.App.QUESTION_COUNT;
import static hexlet.code.common.Util.random;
import java.util.ArrayList;
import java.util.List;

public class ProgressionGame {
    public static void run() {
        List<Card> cards = new ArrayList<>();
        int progressionLength = random.nextInt(5, 11);
        for (int i = 0; i < QUESTION_COUNT; i++) {
            int d = random.nextInt(1, 11);
            int start = random.nextInt(21);
            int[] progression = buildProgression(progressionLength, start, d);

            Card card = buildCard(progression);
            cards.add(card);
        }
        String task = "What number is missing in the progression?";
        BaseGame.start(cards, task);
    }

    private static int[] buildProgression(int length, int start, int d) {
        int[] progression = new int[length];

        for (int j = 0; j < progression.length; j++) {
            progression[j] = start;
            start += d;
        }

        return progression;
    }

    private static Card buildCard(int[] progression) {
        int hideIndex = random.nextInt(0, progression.length);

        StringBuilder question = new StringBuilder();
        String expectedAnswer = String.valueOf(progression[hideIndex]);
        for (int j = 0; j < progression.length; j++) {
            if (j == hideIndex) {
                question.append("..");
            } else {
                question.append(progression[j]);
            }
            question.append(" ");
        }

        return new Card(question.toString(), expectedAnswer);
    }
}
