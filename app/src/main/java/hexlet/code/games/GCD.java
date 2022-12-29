package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

//import java.util.Arrays;
public class GCD {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;
    public static void run() {

        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][2];

        var randomNumberOne = 0;
        var randomNumberTwo = 0;

        for (String[] questionAnswer: questionsAnswers) {
            randomNumberOne = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            randomNumberTwo = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);

            questionAnswer[0] = randomNumberOne + " " + randomNumberTwo;
            questionAnswer[1] = String.valueOf(gcd(randomNumberOne, randomNumberTwo));

        }

    //    System.out.println(Arrays.deepToString(questionsAnswers));

        Engine.runGame(questionsAnswers, DESCRIPTION);

    }

    public static int gcd(int number1, int number2) {

        while ((number1 != 0) & (number2 != 0)) {
            if (number1 > number2) {
                number1 = number1 % number2;
            } else {
                number2 = number2 % number1;
            }
        }
        return (number1 + number2);
    }
}
