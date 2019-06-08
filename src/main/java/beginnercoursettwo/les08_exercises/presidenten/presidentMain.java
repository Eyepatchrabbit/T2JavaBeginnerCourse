package beginnercoursettwo.les08_exercises.presidenten;

import java.util.Scanner;

public class presidentMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean keepPlaying = true;

        while (keepPlaying) {
            boolean gameBussy = true;

            System.out.println("give in the number of players");
            int numberOfPlayers = scanner.nextInt();

            PresidentGame presidentGame = new PresidentGame(numberOfPlayers);
            presidentGame.start();

            while (gameBussy) {
                presidentGame.getNextPlayer();
            }


            System.out.println("do you want to continue With a new game");
            String continueWithPlaying = scanner.next();
            if (!(continueWithPlaying.equals("y") || continueWithPlaying.equals("Yes"))) {
                keepPlaying = false;
            }
        }

    }
}
