package beginnercoursettwo.les08_exercises.presidenten;

import java.util.ArrayList;

public class PresidentGame {

    private ArrayList<Player> players;
    private int numberOfPlayers;

    private Player lastPlayerWhoPlayedCard;
    private Card lastPlayedCard;
    private Player lastPlayer;

    private Card twoOfClubs = new Card("Clubs", 2);


    public PresidentGame(int numberOfPlayers) {
        players = new ArrayList<Player>();
        this.numberOfPlayers = numberOfPlayers;
    }

    public void start() {
        createPlayers();
        distributeCards();
        Player playerWithTwoOfClubs = findingPlayerWithTwoOfClubs();
        playerWithTwoOfClubs.playCard(twoOfClubs);
        lastPlayerWhoPlayedCard = playerWithTwoOfClubs;
        lastPlayedCard = twoOfClubs;
        lastPlayer = playerWithTwoOfClubs;
    }

    public Player getNextPlayer() {
        int lastplayerId = lastPlayer.getId() % numberOfPlayers;
        return players.get(lastplayerId);
    }

    private void createPlayers() {
        for (int playersCreated = 1; playersCreated <= numberOfPlayers; playersCreated++) {
            Player player = new Player(playersCreated);
            players.add(player);
        }
    }

    private void distributeCards() {
        Deck deck = new Deck();
        for (int numberofCardsGiven = 0; numberofCardsGiven < 52; numberofCardsGiven++) {
            int playerIndex = numberofCardsGiven % numberOfPlayers;
            players.get(playerIndex).getPlayersHand().add(deck.drawCard());
        }
    }

    private Player findingPlayerWithTwoOfClubs() {
        Player playerWithTwoOfClubs = null;

        for (Player player : players) {
            if (player.getPlayersHand().contains(twoOfClubs)) {
                playerWithTwoOfClubs = player;
                break;
            }
        }
        return playerWithTwoOfClubs;
    }


}
