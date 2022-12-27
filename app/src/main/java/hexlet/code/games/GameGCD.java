package hexlet.code.games;

import hexlet.code.Engine;

//import java.util.Arrays;
public class GameGCD {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int TRIALCOUNT = 3;
    private static final int MULTIPLIER = 100;
    public static void gcd() {

        String[][] questionsAnswers = new String[TRIALCOUNT][2];

        var randomNumberOne = 0;
        var randomNumberTwo = 0;

        for (var i = 0; i < questionsAnswers.length; i++) {
            randomNumberOne = (int) Math.ceil((Math.random() * MULTIPLIER));
            randomNumberTwo = (int) Math.ceil((Math.random() * MULTIPLIER));
            questionsAnswers[i][0] = randomNumberOne + " " + randomNumberTwo;

            while ((randomNumberOne != 0) & (randomNumberTwo != 0)) {
                if (randomNumberOne > randomNumberTwo) {
                    randomNumberOne = randomNumberOne % randomNumberTwo;
                } else {
                    randomNumberTwo = randomNumberTwo % randomNumberOne;
                }
            }

            questionsAnswers[i][1] = String.valueOf(randomNumberOne + randomNumberTwo);

        }

    //    System.out.println(Arrays.deepToString(questionsAnswers));

        Engine.runGame(questionsAnswers, DESCRIPTION, TRIALCOUNT);

    }
}
