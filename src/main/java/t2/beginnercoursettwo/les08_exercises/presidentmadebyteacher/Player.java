package t2.beginnercoursettwo.les08_exercises.presidentmadebyteacher;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> cards;
    private int id;
    private boolean passed;

    public Player(int id) {
        cards = new ArrayList<>();
        this.id = id;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getId() {
        return id;
    }

    public Card playCard(int value) {
        Card cardPlayed = null;
        for (Card card : cards) {
            if (card.getValue() == value) {
                cardPlayed = card;
                break;
            }
        }
        cards.remove(cardPlayed);
        return cardPlayed;
    }

    public int getNumberOfCardsOfValue(int value) {
        int numberOfCardsOfValue = 0;
        for (Card card : cards) {
            if (card.getValue() == value) {
                numberOfCardsOfValue++;
            }
        }
        return numberOfCardsOfValue;
    }

    public boolean isHuman() {
        return id == 1;
    }

    public boolean hasPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
