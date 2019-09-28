package t2.beginnercoursettwo.les08_exercises.presidentmadebyteacher;

public class Card {

    private int value;
    private String suit;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public boolean equals(Object o) {
        boolean areEqual = false;
        if (o instanceof Card) {
            Card otherCard = (Card) o;
            if (this.value == otherCard.value && this.suit.equals(otherCard.suit)) {
                areEqual = true;
            }
        }
        return areEqual;
    }
}
