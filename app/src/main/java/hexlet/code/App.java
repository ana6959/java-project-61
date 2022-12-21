package hexlet.code;

import java.util.Scanner;
public class App {
    public static String userName;
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
                Your choice: """);

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println();


    //    final int optionZero = 0;
        final int optionOne = 1;
        final int optionTwo = 2;
        final int optionThree = 3;
        final int optionFour = 4;
        final int optionFive = 5;
        final int optionSix = 6;

        switch (userChoice) {
            case optionOne -> greeting();
            case optionTwo -> Games.even();
            case optionThree -> Games.calc();
            case optionFour -> Games.gcd();
            case optionFive -> Games.progression();
            case optionSix -> Games.prime();
            default -> {
            }
        }

        scanner.close();
    }
        public static void greeting() {
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            Scanner scannerName = new Scanner(System.in);
            userName = scannerName.next();
            System.out.println("Hello, " + userName + '!');
        }



}
