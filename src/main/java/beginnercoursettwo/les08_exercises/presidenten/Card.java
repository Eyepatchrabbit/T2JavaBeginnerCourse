package beginnercoursettwo.les08_exercises.presidenten;

public class Card {

    private String suite; //klaveren, schoppen, harten en ruiten
    private int value; //2-14  11=boer, 12=koningin, 13=koning, 14=ass


    public Card(String suite, int value) {
        this.suite = suite;
        this.value = value;
    }

    public String getSuite() {
        return suite;
    }


    public int getValue() {
        return value;
    }

    public String getCardDesignation() {
        return suite + value;
    }

    public boolean equals(Object object) {
        if (object instanceof Card) {
            Card cardToCompare = (Card) object;
            if (cardToCompare.getSuite().equals(this.suite) && cardToCompare.getValue() == this.value) {
                return true;
            }
        }
        return false;
    }

}
