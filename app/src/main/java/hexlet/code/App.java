package hexlet.code;

import java.util.Scanner;
public class App {
    public static String userName;
    public static void main(String[] args) {

        System.out.println("""
                Please enter the game number and press Enter.
                 1 - Greet
                 2 - Even
                 3 - Calc
                 0 - Exit""");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println("Your choice: " + userChoice);


    //    final int optionZero = 0;
        final int optionOne = 1;
        final int optionTwo = 2;
        final int optionThree = 3;

        switch (userChoice) {
            case optionOne:
                greeting();
                break;
            case optionTwo:
                Games.even();
                break;
            case optionThree:
                break;
            default: break;
        }

        scanner.close();
    }
        public static void greeting() {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            Scanner scannerName = new Scanner(System.in);
            userName = scannerName.next();
            System.out.println("Hello, " + userName + '!');
        }



}
