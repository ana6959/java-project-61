package hexlet.code.games;

//import java.util.Arrays;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;
    public static void run() {

        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][2];
        var randomNumber = 1;

        for (String[] questionAnswer: questionsAnswers) {

            randomNumber = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            questionAnswer[0] = String.valueOf(randomNumber);
            questionAnswer[1] = isPrime(randomNumber);

        }

    //    System.out.println(Arrays.deepToString(questionsAnswers));

        Engine.runGame(questionsAnswers, DESCRIPTION);

    }

    public static String isPrime(int number) {

        if (number < 2) {
            return "no";
        }

        var divider = 2;

        while (divider <= number / 2) {
            if (number % divider == 0) {
                return "no";
            }
            divider += 1;
        }
        return "yes";
    }
}
