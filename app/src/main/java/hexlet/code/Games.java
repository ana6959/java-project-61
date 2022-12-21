package hexlet.code;

import java.util.Arrays;
import java.util.Random;
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

       Engine.runGame();

    }

    public static void GCD() {

        intro = "Find the greatest common divisor of given numbers.";

        var randomNumberOne = 0;
        var randomNumberTwo = 0;

        for (var i = 0; i < questionAnswers.length; i++) {
            randomNumberOne = (int) Math.ceil(Math.random() * 50);
            randomNumberTwo = (int) Math.ceil(Math.random() * 50);
            questionAnswers[i][0] = randomNumberOne + " " + randomNumberTwo;

            while ((randomNumberOne != 0) & (randomNumberTwo != 0)) {
                if (randomNumberOne > randomNumberTwo) {
                    randomNumberOne = randomNumberOne % randomNumberTwo;
                } else {
                    randomNumberTwo = randomNumberTwo % randomNumberOne;
                }
            }

            questionAnswers[i][1] = String.valueOf(randomNumberOne + randomNumberTwo);

        }

        Engine.runGame();

    }

    public static void Progression() {

        intro = "What number is missing in the progression?";

        var randomSize = 1;
        var randomIndex = 0;
        var randomProgression = 1;
        var randomFirstuNmber = 1;
        var hiddenNumber = 0;
        Random rand = new Random();

        for (var i = 0; i < questionAnswers.length; i++) {

            randomSize = rand.nextInt(5 , 11);
            randomIndex = rand.nextInt(0, (randomSize - 1));
            randomProgression = rand.nextInt(2 , 10);
            randomFirstuNmber = (int) (Math.random() * 10);
            String[] progression = new String[randomSize];
            questionAnswers[i][0] = "";


            for (var j = 0; j < randomSize; j++) {
                if (j == randomIndex) {
                    hiddenNumber = randomFirstuNmber + j * randomProgression;
                    progression[j] = "..";
                } else {
                    progression[j] = String.valueOf(randomFirstuNmber + j * randomProgression);
                }
                questionAnswers[i][0] += progression[j] + " ";
            }

            questionAnswers[i][1] = String.valueOf(hiddenNumber);

        }

     //   System.out.println(Arrays.deepToString(questionAnswers));
        Engine.runGame();

    }



}
