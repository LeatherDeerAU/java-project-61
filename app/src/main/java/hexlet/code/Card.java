package hexlet.code;

public class Card {
    private final String question;
    private final String expectedAnswer;

    public Card(String questionParam, String expectedAnswerParam) {
        this.question = questionParam;
        this.expectedAnswer = expectedAnswerParam;
    }

    /**
     * Getter.
     * @return question of this card.
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * Setter.
     * @return answer of this card.
     */
    public String getExpectedAnswer() {
        return this.expectedAnswer;
    }
}
