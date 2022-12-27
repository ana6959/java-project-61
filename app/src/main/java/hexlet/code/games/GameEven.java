package hexlet.code.games;

import hexlet.code.Engine;

//import java.util.Arrays;
public class GameEven {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int TRIALCOUNT = 3;
    private static final int MULTIPLIER = 10;
    public static void even() {

        String[][] questionsAnswers = new String[TRIALCOUNT][2];

        var randomNumber = 0;

        for (var i = 0; i < questionsAnswers.length; i++) {
            randomNumber = (int) (Math.random() * MULTIPLIER);
            questionsAnswers[i][0] = Integer.toString(randomNumber);
            questionsAnswers[i][1] = (randomNumber % 2) == 0 ? "yes" : "no";
        }

    //    System.out.println(Arrays.deepToString(questionsAnswers));

        Engine.runGame(questionsAnswers, DESCRIPTION, TRIALCOUNT);
    }
}
