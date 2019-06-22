package beginnercoursettwo.les08_exercises.presidentmadebyteacher;

public class PresidentMain {

    public static void main(String[] args) {
        PresidentGame presidentGame;
        do {
            presidentGame = new PresidentGame(4);
            presidentGame.startGame();
            while (!presidentGame.isOver()) {
                if (presidentGame.newRoundNeedsToStart()) {
                    System.out.println("Starting new round.");
                    presidentGame.startNewRound();
                }
                Player nextPlayer = presidentGame.getNextPlayer();
                if (!nextPlayer.hasPassed()) {
                    int lowestValue = presidentGame.getLowestPossibleValueThePlayerCanPlay(nextPlayer);
                    if (lowestValue > -1) {
                        if (!nextPlayer.isHuman()) {
                            presidentGame.playCard(nextPlayer, lowestValue);
                        } else {
                            System.out.println("Cards you have left in your hand:");
                            presidentGame.printCards(nextPlayer);
                            int value = presidentGame.askWhichCardUserWantsToPlay();
                            presidentGame.playCard(nextPlayer, value);
                        }
                    } else {
                        System.out.println("Player " + nextPlayer.getId() + " has to pass. He has " + nextPlayer.getCards().size() + " cards left.");
                        nextPlayer.setPassed(true);
                    }
                }
            }
            System.out.println("Player that won the game: Player " + presidentGame.getLastPlayerThatPlayedACard().getId());
        } while (true);
    }
}
