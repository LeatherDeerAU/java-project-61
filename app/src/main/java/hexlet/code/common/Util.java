package hexlet.code.common;

import java.util.Random;
import java.util.Scanner;

public class Util {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    public static String greetingAndGetUserName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String name = scanner.next();
        System.out.println("Hello, " + name + "!");

        return name;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static Random getRandom() {
        return random;
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
