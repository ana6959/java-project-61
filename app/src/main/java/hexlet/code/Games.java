package hexlet.code;

import java.util.Arrays;
import java.util.Scanner;

public class Games {

    public static String intro;
    public static int trialCount = 3;
    public static String[][] questionAnswers = new String[trialCount][2];
    public static void even() {

        //even()
        intro = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        var randomNumber = 0;

        for (var i = 0; i < questionAnswers.length; i++) {

            randomNumber = (int) (Math.random() * 10);
            questionAnswers[i][0] = Integer.toString(randomNumber);
            questionAnswers[i][1] = (randomNumber % 2) == 0 ? "yes" : "no";
        }

    //    System.out.println(Arrays.deepToString(questionAnswers));

        Engine.runGame();

    }


}
