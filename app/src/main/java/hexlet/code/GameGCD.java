package hexlet.code;

//import java.util.Arrays;
public class GameGCD {
    public static void gcd() {

        String intro = "Find the greatest common divisor of given numbers.";

        final int trialCount = 3;
        String[][] questionsAnswers = new String[trialCount][2];
        final int multiplier = 100;
        var randomNumberOne = 0;
        var randomNumberTwo = 0;

        for (var i = 0; i < questionsAnswers.length; i++) {
            randomNumberOne = (int) Math.ceil((Math.random() * multiplier));
            randomNumberTwo = (int) Math.ceil((Math.random() * multiplier));
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

        Engine.runGame(questionsAnswers, intro, trialCount);

    }
}
