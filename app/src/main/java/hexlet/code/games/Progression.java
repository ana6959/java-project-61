package hexlet.code.games;

//import java.util.Arrays;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int MIN_SIZE_OF_PROGRESSION = 5;
    private static final int MAX_SIZE_OF_PROGRESSION = 10;
    public static void run() {

        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][2];

        var randomSizeOfProgression = 1;
        var randomHiddenIndex = 0;
        var randomProgressionStep = 1;
        var randomFirstNumber = 1;

        for (String[] questionAnswer: questionsAnswers) {

            randomSizeOfProgression = Utils.generateNumber(MIN_SIZE_OF_PROGRESSION, MAX_SIZE_OF_PROGRESSION);
            randomHiddenIndex = Utils.generateNumber(0, randomSizeOfProgression - 1);
            randomProgressionStep = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            randomFirstNumber = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);

            String[] progression = progressionGenerate(randomSizeOfProgression,
                    randomFirstNumber, randomProgressionStep);

            questionAnswer[1] = (progression[randomHiddenIndex]);
            progression[randomHiddenIndex] = "..";
            questionAnswer[0] = String.join(" ", progression);

        }

    //    System.out.println(Arrays.deepToString(questionsAnswers));

        Engine.runGame(questionsAnswers, DESCRIPTION);

    }

    private static String[] progressionGenerate(int size, int first, int step) {

        String[] progression = new String[size];

        for (var j = 0; j < size; j++) {
            progression[j] = String.valueOf(first + j * step);
        }

        return progression;
    }

}
