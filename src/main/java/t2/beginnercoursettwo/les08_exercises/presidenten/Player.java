package t2.beginnercoursettwo.les08_exercises.presidenten;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private int id;
    private ArrayList<Card> playersHand;
    private boolean passed = false;

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

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }


    public void playCard(Card card) {
        System.out.println("Player " + getId() + " plays card " + card.toString() + ". Number of cards in hand=" + (playersHand.size() - 1));
        playersHand.remove(card);
    }

    public Card getLowestPlayable(Card lastPlayedCard) {
        Card lowestPossibleCard = null;

        if (lastPlayedCard.getValue() < 14) {
            for (Card card : playersHand) {
                if (card.getValue() >= lastPlayedCard.getValue()) {
                    if (lowestPossibleCard != null && lowestPossibleCard.getValue() > card.getValue()) {
                        lowestPossibleCard = card;
                    } else if (lowestPossibleCard == null) {
                        lowestPossibleCard = card;
                    }
                }
            }
        }
        return lowestPossibleCard;
    }

    public void showCards() {
        System.out.println("The cards in your hand are:");
        for (Card card : playersHand) {
            if (!card.equals(playersHand.get(playersHand.size() - 1))) {
                System.out.print(card.toString() + ", ");
            } else {
                System.out.print(card.toString());
            }
        }
    }

    public boolean isHumanPlayer() {
        return getId() == 1;
    }

    public Card askForCardToPlay(Card lastPlayedCard) {
        Card lowestplayableCard = getLowestPlayable(lastPlayedCard);
        Card cardToPlay = null;

        if (lowestplayableCard != null) {
            showCards();
            System.out.println("\nYour Turn. Which card do you want to play? Give in the value: ");
            Scanner scanner = new Scanner(System.in);
            //TODO: check if it is possible to play this (that player can't cheat): see if >= last played card !
            int cardChosen = scanner.nextInt();

            if (cardChosen > 0) {
                for (Card card : playersHand) {
                    if (card.getValue() == cardChosen) {
                        cardToPlay = card;
                        break;
                    }
                }
            }
        }
        return cardToPlay;
    }

    public boolean equals(Object object) {
        boolean areEquals = false;
        if (object instanceof Player) {

            Player playerToCompare = (Player) object;
            if (playerToCompare.getId() == getId()) {
                areEquals = true;
            }
        }
        return areEquals;
    }

}