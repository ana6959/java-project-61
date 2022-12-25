package hexlet.code;

import java.util.Scanner;
//import java.lang.Math;

public class Engine {

    public static void runGame(String[][] questionsAnswers, String intro, int trialCount) {

        Scanner scannerName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scannerName.next();
        System.out.println("Hello, " + userName + '!');
        System.out.println(intro);
        Scanner scanner = new Scanner(System.in);

        for (var i = 0; i < trialCount; i++) {

            System.out.println("Question: " + questionsAnswers[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (questionsAnswers[i][1].equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + questionsAnswers[i][1] + "'."
                        + "\nLet's try again, " + userName + "!");
                break;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }




    }
}
