package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

//import java.util.Arrays;
public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final char[] OPERATORS = {'+', '-', '*'};
    public static void run() {

        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][2];

        var randomNumberOne = 0;
        var randomNumberTwo = 0;
        var randomOperatorIndex = 0;
        var randomOperator = ' ';

        for (String[] questionAnswer: questionsAnswers) {
            randomNumberOne = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            randomNumberTwo = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            randomOperatorIndex = Utils.generateNumber(0, OPERATORS.length - 1);
            randomOperator = OPERATORS[randomOperatorIndex];
            questionAnswer[0] = randomNumberOne + " " + randomOperator + " " + randomNumberTwo;
            questionAnswer[1] = Integer.toString(calculate(randomOperator, randomNumberOne, randomNumberTwo));
        }

    //    System.out.println(Arrays.deepToString(questionsAnswers));

        Engine.runGame(questionsAnswers, DESCRIPTION);
    }
    private static int calculate(char operator, int number1, int number2) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }
}
