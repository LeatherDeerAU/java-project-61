package hexlet.code.common;

import static hexlet.code.App.scanner;

public class Util {
    public static final int QUESTION_COUNT = 3;
    public static String greetingAndGetUserName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String name = scanner.next();
        System.out.println("Hello, " + name);

        return name;
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            a = a % b;

            int temp = a;
            a = b;
            b = temp;
        }

        return a;
    }
}
