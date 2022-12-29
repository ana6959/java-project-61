package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS_COUNT = 3;
    public static void runGame(String[][] questionsAnswers, String description) {

        Scanner scannerName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scannerName.next();
        System.out.println("Hello, " + userName + '!');
        System.out.println(description);
        Scanner scanner = new Scanner(System.in);

        for (String[] questionAnswer: questionsAnswers) {

            System.out.println("Question: " + questionAnswer[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (questionAnswer[1].equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + questionAnswer[1] + "'."
                        + "\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");

    }
}
