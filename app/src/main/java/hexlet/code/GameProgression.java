package hexlet.code;

//import java.util.Arrays;
import java.util.Random;
public class GameProgression {
    public static void progression() {

        String intro = "What number is missing in the progression?";
        final int trialCount = 3;
        String[][] questionsAnswers = new String[trialCount][2];
        final int multiplier = 10;
        var randomSize = 1;
        var randomIndex = 0;
        var randomProgression = 1;
        var randomFirstNumber = 1;
        var hiddenNumber = 0;
        final int randomStart = 5;
        final int randomFinish = 11;
        Random rand = new Random();

        for (var i = 0; i < questionsAnswers.length; i++) {

            randomSize = rand.nextInt(randomStart, randomFinish);
            randomIndex = rand.nextInt(0, (randomSize - 1));
            randomProgression = (int) Math.ceil(Math.random() * multiplier);
            randomFirstNumber = (int) (Math.random() * multiplier);
            String[] progression = new String[randomSize];
            questionsAnswers[i][0] = "";

            for (var j = 0; j < randomSize; j++) {
                if (j == randomIndex) {
                    hiddenNumber = randomFirstNumber + j * randomProgression;
                    progression[j] = "..";
                } else {
                    progression[j] = String.valueOf(randomFirstNumber + j * randomProgression);
                }
                questionsAnswers[i][0] += progression[j] + " ";
            }

            questionsAnswers[i][1] = String.valueOf(hiddenNumber);

        }

        //System.out.println(Arrays.deepToString(questionsAnswers));

        Engine.runGame(questionsAnswers, intro, trialCount);

    }
}
