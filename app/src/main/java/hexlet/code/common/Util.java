package hexlet.code.common;

import java.util.Random;
import java.util.Scanner;

public class Util {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();
    public static String greetingAndGetUserName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String name = SCANNER.next();
        System.out.println("Hello, " + name + "!");

        return name;
    }

    public static Scanner getScanner() {
        return SCANNER;
    }

    public static Random getRandom() {
        return RANDOM;
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
