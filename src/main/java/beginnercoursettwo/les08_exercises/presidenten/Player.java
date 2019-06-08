package beginnercoursettwo.les08_exercises.presidenten;

import java.util.ArrayList;

public class Player {

    private int id;
    private ArrayList<Card> playersHand;

    public Player(int id) {
        this.id = id;
        this.playersHand = new ArrayList<Card>();
    }

    public int getId() {
        return id;
    }

    public ArrayList<Card> getPlayersHand() {
        return playersHand;
    }

    public void setPlayersHand(ArrayList<Card> playersHand) {
        this.playersHand = playersHand;
    }

    public int sizeHand() {
        return playersHand.size();
    }

    public void playCard(Card card) {
        playersHand.remove(card);
    }

    public Card getLowestPlayable(Card lastPlayedCard) {
        Card lowestPossibleCard = null;

        for (Card card : playersHand) {
            if (card.getValue() >= lastPlayedCard.getValue()) {
                if (lowestPossibleCard != null && lowestPossibleCard.getValue() > card.getValue()) {
                    lowestPossibleCard = card;
                } else if (lowestPossibleCard == null) {
                    lowestPossibleCard = card;
                }
            }
        }

        return lowestPossibleCard;

    }


}