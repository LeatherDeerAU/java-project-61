package hexlet.code;

public class Card {
    private final String question;
    private final String expectedAnswer;

    public Card(String question, String expectedAnswer) {
        this.question = question;
        this.expectedAnswer = expectedAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getExpectedAnswer() {
        return expectedAnswer;
    }
}
