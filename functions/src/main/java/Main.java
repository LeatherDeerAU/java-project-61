public class Main {
    public static void main(String[] args) {
        char somethChar = '5';
        System.out.println(Character.isLetter(somethChar));

        double weight = 23.85;
        System.out.println(Math.round(weight));

        System.out.println(sum(2, 2));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
