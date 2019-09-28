package t2course.gevorderdencursusttwo.beginnercoursettwo.les04;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumberToGuess = new Random().nextInt(50);

        boolean guessedCorrectly = false;

        try {
            int maxGuessesAllowed = 10;

            for (int guesses = 0; guesses < maxGuessesAllowed; guesses++) {
                System.out.print("Guess number: ");
                int guessForNumber = scanner.nextInt();
                if (guessForNumber == randomNumberToGuess) {
                    System.out.println("YOU WIN, the number was: " + randomNumberToGuess + ". It took you " + guesses + " to find it");
                    guessedCorrectly = true;
                    break;
                } else {
                    System.out.print("Incorrect, you still have " + (maxGuessesAllowed - 1 - guesses) + " tries left");

                    if (guessForNumber > randomNumberToGuess) {
                        System.out.println("The number you entred is too high");
                    } else {
                        System.out.println("The number was too low");
                    }
                }
            }

            if (!guessedCorrectly) {
                System.out.println("YOU LOST. The number you were looking for was: " + randomNumberToGuess + ". Better luck next time :)");
            }
        } finally {
            scanner.close();
        }
    }
}
