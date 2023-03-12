package hexlet.code.games;

import hexlet.code.Card;

import static hexlet.code.App.QUESTION_COUNT;
import static hexlet.code.common.Util.random;
import java.util.ArrayList;
import java.util.List;

public class ProgressionGame {
    private static final int PROGRESSION_LOW_BOUND = 5;
    private static final int PROGRESSION_UP_BOUND = 11;

    private static final int D_LOW_BOUND = 11;

    private static final int D_UP_BOUND = 11;

    private static final int START_UP_BOUND = 11;

    public static void run() {
        List<Card> cards = new ArrayList<>();
        int progressionLength = random.nextInt(PROGRESSION_LOW_BOUND, PROGRESSION_UP_BOUND);
        for (int i = 0; i < QUESTION_COUNT; i++) {
            int d = random.nextInt(D_LOW_BOUND, D_UP_BOUND);
            int start = random.nextInt(START_UP_BOUND);
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
