package hexlet.code;

//import java.util.Arrays;
public class GameCalc {

    public static void calc() {

        String intro = "What is the result of the expression?";

        final int trialCount = 3;
        String[][] questionsAnswers = new String[trialCount][2];
        final int multiplier = 10;

        var randomNumberOne = 0;
        var randomNumberTwo = 0;
        var randomOperatorIndex = 0;
        var randomOperator = ' ';
        char[] operator = {'+', '-', '*'};

        for (var i = 0; i < questionsAnswers.length; i++) {
            randomNumberOne = (int) (Math.random() * multiplier);
            randomNumberTwo = (int) (Math.random() * multiplier);
            randomOperatorIndex = (int) Math.round(Math.random() * (operator.length - 1));
            randomOperator = operator[randomOperatorIndex];
            questionsAnswers[i][0] = randomNumberOne + " " + randomOperator + " " + randomNumberTwo;

            switch (randomOperator) {
                case '+':
                    questionsAnswers[i][1] = Integer.toString(randomNumberOne + randomNumberTwo);
                    break;
                case '-':
                    questionsAnswers[i][1] = Integer.toString(randomNumberOne - randomNumberTwo);
                    break;
                default:
                    questionsAnswers[i][1] = Integer.toString(randomNumberOne * randomNumberTwo);
                    break;
            }
        }

    //    System.out.println(Arrays.deepToString(questionsAnswers));

        Engine.runGame(questionsAnswers, intro, trialCount);

    }

}
