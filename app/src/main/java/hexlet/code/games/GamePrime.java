package hexlet.code.games;

//import java.util.Arrays;
import hexlet.code.Engine;

import java.util.Random;
public class GamePrime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int TRIALCOUNT = 3;
    private static final int MAXRANDOMNUMBER = 100;
    public static void prime() {

        String[][] questionsAnswers = new String[TRIALCOUNT][2];
        var randomNumber = 1;
        Random rand = new Random();

        for (var i = 0; i < questionsAnswers.length; i++) {

            randomNumber = rand.nextInt(2, MAXRANDOMNUMBER);
            questionsAnswers[i][0] = String.valueOf(randomNumber);

            if (randomNumber == 2) {
                questionsAnswers[i][1] = "yes";
            }

            for (var j = 2; j < randomNumber; j++) {
                if (randomNumber % j == 0) {
                    questionsAnswers[i][1] = "no";
                    break;
                }
                questionsAnswers[i][1] = "yes";
            }
        }

    //    System.out.println(Arrays.deepToString(questionsAnswers));

        Engine.runGame(questionsAnswers, DESCRIPTION, TRIALCOUNT);

    }
}
