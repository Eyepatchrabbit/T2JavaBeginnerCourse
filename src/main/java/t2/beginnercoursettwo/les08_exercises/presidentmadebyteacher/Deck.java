package t2.beginnercoursettwo.les08_exercises.presidentmadebyteacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        List<String> suits = new ArrayList<>();
        suits.add("Hearts");
        suits.add("Diamonds");
        suits.add("Clubs");
        suits.add("Spades");
        for (String suit : suits) {
            for(int number = 2; number <= 14; number++) {
                cards.add(new Card(number, suit));
            }
        }
    }

    public Card drawCard() {
        Random random = new Random();
        return cards.remove(random.nextInt(cards.size()));
    }
}
