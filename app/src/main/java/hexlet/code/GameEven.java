package hexlet.code;

//import java.util.Arrays;
public class GameEven {
    public static void even() {

        String intro = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        final int trialCount = 3;
        String[][] questionsAnswers = new String[trialCount][2];
        final int multiplier = 10;
        var randomNumber = 0;

        for (var i = 0; i < questionsAnswers.length; i++) {
            randomNumber = (int) (Math.random() * multiplier);
            questionsAnswers[i][0] = Integer.toString(randomNumber);
            questionsAnswers[i][1] = (randomNumber % 2) == 0 ? "yes" : "no";
        }

    //    System.out.println(Arrays.deepToString(questionsAnswers));

        Engine.runGame(questionsAnswers, intro, trialCount);
    }
}
