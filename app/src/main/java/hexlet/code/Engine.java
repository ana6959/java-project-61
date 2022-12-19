package hexlet.code;

import java.util.Scanner;
import java.lang.Math;

public class Engine {

    public static void runGame() {

        App.greeting();
        System.out.println(Games.intro);
        Scanner scanner = new Scanner(System.in);

       for (var i = 0; i < Games.trialCount; i++) {

            System.out.println("Question: " + Games.questionAnswers[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (Games.questionAnswers[i][1].equals(userAnswer)) {
                 System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + Games.questionAnswers[i][1] + "'."
                        + "\nLet's try again, " + App.userName + "!");
                break;
            }

           if (i == 2) {
                System.out.println("Congratulations, " + App.userName + "!");
            }
        }




    }
}
