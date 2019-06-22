package beginnercoursettwo.les08_exercises.presidenten;

import java.util.Scanner;

public class presidentMain {

    public static void main(String[] args) {
        boolean keepPlaying = true;
        Scanner scanner = new Scanner(System.in);
        while (keepPlaying) {

            System.out.println("Give total number of players");
            int numberOfPlayers = scanner.nextInt();

            gameInSession(new PresidentGame(numberOfPlayers));

            System.out.println("do you want to continue With a new game. If so type y(es)");
            String continueWithPlaying = scanner.next().toLowerCase();
            if (!(continueWithPlaying.equals("y") || continueWithPlaying.equals("yes"))) {
                keepPlaying = false;
            }
        }
    }


    private static void gameInSession(PresidentGame presidentGame) {
        presidentGame.start();

        while (!presidentGame.isGameOver()) {
            Player player = presidentGame.getNextPlayer();

            if (presidentGame.getLastPlayerWhoPlayedCard().equals(player) || presidentGame.getLastPlayedCard().getValue() == 14) {
                player = presidentGame.newRound();
            }

            if (player.isPassed()) {
                System.out.println("player " + player.getId() + " is passed.");
            } else {
                Card cardToPlay;
                if (player.isHumanPlayer()) {
                    cardToPlay = player.askForCardToPlay(presidentGame.getLastPlayedCard());
                } else {
                    cardToPlay = player.getLowestPlayable(presidentGame.getLastPlayedCard());
                }

                if (cardToPlay != null) {
                    player.playCard(cardToPlay);

                    presidentGame.setLastPlayerWhoPlayedCard(player);
                    presidentGame.setLastPlayedCard(cardToPlay);
                } else {
                    player.setPassed(true);
                    System.out.println("Player " +player.getId()+" had to pass.");
                }
            }

            if (presidentGame.isGameOver()){
                if (player.getId()==1){
                    System.out.println("You won");
                }else {
                    System.out.println("Player "+player.getId()+" has won. Sorry You lose");
                }
            }
        }

    }

}
