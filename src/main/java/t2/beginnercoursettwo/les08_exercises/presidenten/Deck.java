package t2.beginnercoursettwo.les08_exercises.presidenten;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    ArrayList<Card> cards;

    //setting up the cards to play
    public Deck() {
        cards = new ArrayList<Card>();

        String[] cardTypes = {"Hearths", "Diamonds", "Spades", "Clubs"}; //H, D, S, C

        for (String type : cardTypes) {
            for (int value = 2; value <= 14; value++) {
                cards.add(new Card(type, value));
            }
        }
    }

    public Card drawCard() {
        return cards.remove(new Random().nextInt(cards.size()));

    }

}
