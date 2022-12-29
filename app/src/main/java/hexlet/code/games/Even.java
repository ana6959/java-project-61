package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

//import java.util.Arrays;
public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 10;
    public static void run() {

        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][2];

        var randomNumber = 0;

        for (String[] questionAnswer: questionsAnswers) {
            randomNumber = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            questionAnswer[0] = Integer.toString(randomNumber);
            questionAnswer[1] = (randomNumber % 2) == 0 ? "yes" : "no";
        }

    //    System.out.println(Arrays.deepToString(questionsAnswers));

        Engine.runGame(questionsAnswers, DESCRIPTION);
    }
}
