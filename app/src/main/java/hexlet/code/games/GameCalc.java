package hexlet.code.games;

import hexlet.code.Engine;

//import java.util.Arrays;
public class GameCalc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final int TRIALCOUNT = 3;
    private static final int MULTIPLIER = 10;
    private static final char[] OPERATORS = {'+', '-', '*'};
    public static void calc() {

        String[][] questionsAnswers = new String[TRIALCOUNT][2];

        var randomNumberOne = 0;
        var randomNumberTwo = 0;
        var randomOperatorIndex = 0;
        var randomOperator = ' ';

        for (var i = 0; i < questionsAnswers.length; i++) {
            randomNumberOne = (int) (Math.random() * MULTIPLIER);
            randomNumberTwo = (int) (Math.random() * MULTIPLIER);
            randomOperatorIndex = (int) Math.round(Math.random() * (OPERATORS.length - 1));
            randomOperator = OPERATORS[randomOperatorIndex];
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

        Engine.runGame(questionsAnswers, DESCRIPTION, TRIALCOUNT);

    }

}
