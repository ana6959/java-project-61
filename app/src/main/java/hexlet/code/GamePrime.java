package hexlet.code;

//import java.util.Arrays;
import java.util.Random;
public class GamePrime {

    public static void prime() {

        String intro = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int trialCount = 3;
        String[][] questionsAnswers = new String[trialCount][2];
        var randomNumber = 1;
        final int randomFinish = 100;
        Random rand = new Random();

        for (var i = 0; i < questionsAnswers.length; i++) {

            randomNumber = rand.nextInt(2, randomFinish);
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

        Engine.runGame(questionsAnswers, intro, trialCount);

    }
}
