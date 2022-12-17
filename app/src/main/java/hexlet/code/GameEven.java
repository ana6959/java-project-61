package hexlet.code;

import java.util.Scanner;
import java.lang.Math;

public class GameEven {

    public static void resultIsEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int trialCount = 3;
        var randomNumber = 0;
        String isEven = "";
        Scanner scanner = new Scanner(System.in);

        for (var i = 1; i <= trialCount; i++) {
            randomNumber = (int) (Math.random() * 10);
            isEven = (randomNumber % 2) == 0 ? "yes" : "no";
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (isEven.equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + isEven + "'." +
                        "Let's try again, " + App.userName + "!");
                break;
            }

            if (i == 3) {
                System.out.println("Congratulations, " + App.userName + "!");
            }
        }




    }
}
