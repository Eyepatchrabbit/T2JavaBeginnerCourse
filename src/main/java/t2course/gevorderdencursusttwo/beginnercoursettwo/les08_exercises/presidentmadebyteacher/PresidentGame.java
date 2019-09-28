package t2course.gevorderdencursusttwo.beginnercoursettwo.les08_exercises.presidentmadebyteacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PresidentGame {

    private Deck deck;
    private List<Player> players;
    private Player lastPlayerThatPlayedACard;
    private int lastValuePlayed;
    private int numberOfPlayers;
    private Card twoOfClubs;
    private Scanner scanner;
    private boolean newRound;
    private Player lastPlayer;

    public PresidentGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        twoOfClubs = new Card(2, "Clubs");
        scanner = new Scanner(System.in);
    }

    public Player getLastPlayerThatPlayedACard() {
        return lastPlayerThatPlayedACard;
    }

    public void startGame() {
        deck = new Deck();
        players = new ArrayList<>();
        createPlayers();
        dealCardsToPlayers();
        Player playerWithTwoOfClubs = findPlayerWithTwoOfClubs();
        int index = playerWithTwoOfClubs.getCards().indexOf(twoOfClubs);
        playerWithTwoOfClubs.getCards().remove(index);
        System.out.println("Player " + playerWithTwoOfClubs.getId() + " has played the 2 of clubs.");
        lastPlayerThatPlayedACard = playerWithTwoOfClubs;
        lastValuePlayed = 2;
        lastPlayer = lastPlayerThatPlayedACard;
    }

    public boolean isOver() {
        boolean isOver = false;
        for (Player player : players) {
            if (player.getCards().isEmpty()) {
                isOver = true;
                break;
            }
        }
        return isOver;
    }

    public int getLowestPossibleValueThePlayerCanPlay(Player player) {
        int lowestValue = -1;
        for (int cardValue = lastValuePlayed; cardValue <= 14; cardValue++) {
            if (player.getNumberOfCardsOfValue(cardValue) > 0) {
                lowestValue = cardValue;
                break;
            }
        }
        return lowestValue;
    }

    public void printCards(Player player) {
        for (int cardValue = 2; cardValue <= 14; cardValue++) {
            System.out.print(player.getNumberOfCardsOfValue(cardValue) + "x" + cardValue + " - ");
        }
        System.out.println();
    }

    public int askWhichCardUserWantsToPlay() {
        System.out.println("Which card do you want to play?");
        int nextCardToPlay = scanner.nextInt();
        return nextCardToPlay;
    }

    public void playCard(Player player, int value) {
        newRound = false;
        player.playCard(value);
        lastPlayerThatPlayedACard = player;
        lastValuePlayed = value;
        System.out.println("Player " + lastPlayerThatPlayedACard.getId() + " has played a " + lastValuePlayed);
    }

    public void startNewRound() {
        for (Player player : players) {
            player.setPassed(false);
        }
        lastValuePlayed = 0;
        newRound = true;
    }

    public boolean newRoundNeedsToStart() {
        return lastValuePlayed == 14 || getNumberOfPlayersThatPassed() == numberOfPlayers - 1;
    }

    private int getNumberOfPlayersThatPassed() {
        int numberOfPlayersThatPassed = 0;
        for (Player player : players) {
            if (player.hasPassed()) {
                numberOfPlayersThatPassed++;
            }
        }

        return numberOfPlayersThatPassed;
    }

    public Player getNextPlayer() {
        if (newRound) {
            return lastPlayerThatPlayedACard;
        }
        int nextId = lastPlayer.getId() % numberOfPlayers;
        lastPlayer = players.get(nextId);
        return lastPlayer;
    }

    private void dealCardsToPlayers() {
        for (int cardsDealt = 0; cardsDealt < 52; cardsDealt++) {
            int playerIndex = cardsDealt % numberOfPlayers;
            Player playerReceivingCard = players.get(playerIndex);
            playerReceivingCard.getCards().add(deck.drawCard());
        }
    }

    private void createPlayers() {
        for (int playersCreated = 0; playersCreated < numberOfPlayers; playersCreated++) {
            Player player = new Player(playersCreated + 1);
            players.add(player);
        }
    }

    private Player findPlayerWithTwoOfClubs() {
        for (Player player : players) {
            if (player.getCards().indexOf(twoOfClubs) > -1) {
                return player;
            }
        }
        return null;
    }
}
