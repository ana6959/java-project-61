package hexlet.code.games;

//import java.util.Arrays;
import hexlet.code.Engine;

import java.util.Random;
public class GameProgression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int TRIALCOUNT = 3;
    private static final int MULTIPLIER = 10;
    private static final int MINSIZEOFPROGRESSION = 5;
    private static final int MAXSIZEOFPROGRESSION = 10;
    public static void progression() {

        String[][] questionsAnswers = new String[TRIALCOUNT][2];

        var randomSizeOfProgression = 1;
        var randomIndex = 0;
        var randomProgressionStep = 1;
        var randomFirstNumber = 1;
        var hiddenNumber = 0;

        Random rand = new Random();

        for (var i = 0; i < questionsAnswers.length; i++) {

            randomSizeOfProgression = rand.nextInt(MINSIZEOFPROGRESSION, MAXSIZEOFPROGRESSION + 1);
            randomIndex = rand.nextInt(0, (randomSizeOfProgression - 1));
            randomProgressionStep = (int) Math.ceil(Math.random() * MULTIPLIER);
            randomFirstNumber = (int) (Math.random() * MULTIPLIER);
            String[] progression = new String[randomSizeOfProgression];
            questionsAnswers[i][0] = "";

            for (var j = 0; j < randomSizeOfProgression; j++) {
                if (j == randomIndex) {
                    hiddenNumber = randomFirstNumber + j * randomProgressionStep;
                    progression[j] = "..";
                } else {
                    progression[j] = String.valueOf(randomFirstNumber + j * randomProgressionStep);
                }
                questionsAnswers[i][0] += progression[j] + " ";
            }

            questionsAnswers[i][1] = String.valueOf(hiddenNumber);

        }

        //System.out.println(Arrays.deepToString(questionsAnswers));

        Engine.runGame(questionsAnswers, DESCRIPTION, TRIALCOUNT);

    }
}
