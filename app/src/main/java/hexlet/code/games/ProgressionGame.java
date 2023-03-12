package hexlet.code.games;

import hexlet.code.Card;
import hexlet.code.common.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProgressionGame {
    public static void run() {
        System.out.println("What number is missing in the progression?");

        Random random = new Random();

        List<Card> cards = new ArrayList<>();
        int progressionLength = random.nextInt(5, 11);
        for (int i = 0; i < Util.QUESTION_COUNT; i++) {
            int d = random.nextInt(1, 11);
            int start = random.nextInt(21);
            int[] progression = new int[progressionLength];

            for (int j = 0; j < progression.length; j++) {
                progression[j] = start;
                start += d;
            }

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

            cards.add(new Card(question.toString(), expectedAnswer));
        }

        BaseGame.start(cards);
    }
}
