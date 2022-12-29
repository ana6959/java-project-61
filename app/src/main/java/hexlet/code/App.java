package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println();

        final int optionZero = 0;
        final int optionOne = 1;
        final int optionTwo = 2;
        final int optionThree = 3;
        final int optionFour = 4;
        final int optionFive = 5;
        final int optionSix = 6;

        switch (userChoice) {
            case optionZero -> {
            }
            case optionOne -> greeting();
            case optionTwo -> Even.run();
            case optionThree -> Calc.run();
            case optionFour -> GCD.run();
            case optionFive -> Progression.run();
            case optionSix -> Prime.run();
            default -> throw new RuntimeException("Unknown input: " + userChoice);
        }

        scanner.close();
    }
    public static void greeting() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scannerName = new Scanner(System.in);
        String userName = scannerName.next();
        System.out.println("Hello, " + userName + '!');

    }
}
