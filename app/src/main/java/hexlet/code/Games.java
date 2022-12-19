package hexlet.code;

import java.util.Arrays;
import java.util.Scanner;

public class Games {

    public static String intro;
    public static int trialCount = 3;
    public static String[][] questionAnswers = new String[trialCount][2];
    public static void even() {
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


    public static void calc() {

        intro = "What is the result of the expression?";

        var randomNumberOne = 0;
        var randomNumberTwo = 0;
        var randomOperatorIndex = 0;
        var randomOperator = ' ';
        char[] operator = {'+', '-', '*'};

        for (var i = 0; i < questionAnswers.length; i++) {
            randomNumberOne = (int) (Math.random() * 50);
            randomNumberTwo = (int) (Math.random() * 50);
            randomOperatorIndex = (int) Math.round(Math.random() * 2);
            randomOperator = operator[randomOperatorIndex];
            questionAnswers[i][0] = randomNumberOne + " " + randomOperator + " " + randomNumberTwo;
            switch (randomOperator) {
                case '+' -> questionAnswers[i][1] = Integer.toString(randomNumberOne + randomNumberTwo);
                case '-' -> questionAnswers[i][1] = Integer.toString(randomNumberOne - randomNumberTwo);
                default -> questionAnswers[i][1] = Integer.toString(randomNumberOne * randomNumberTwo);
            }

        }


    //        System.out.println(Arrays.deepToString(questionAnswers));

       Engine.runGame();

    }

}
