package beginnercoursettwo.les05;

import java.util.Scanner;

public class Player {

    private int somKaarten;

    private int minimum;

    private int jetons;

    private Scanner scanner;

    private String inputForYes = "y";

    public Player(int kaart1, int kaart2, int minimum) {
        //2 kaarten in begin krijgen
        this.somKaarten = kaart1 + kaart2;
        this.minimum = minimum;
        this.scanner = new Scanner(System.in);
    }

    public int getSomKaarten() {
        return somKaarten;
    }

    public void addCard(int nieuweKaart) {
        if (nieuweKaart == 11 && ((somKaarten + nieuweKaart) > 21)) {
            nieuweKaart = 1;
        }

        this.somKaarten = somKaarten + nieuweKaart;
    }

    public int getMinimum() {
        return minimum;
    }

    public boolean sumLessThenMinimum() {
        return somKaarten < minimum;
    }

    public boolean moreThen21() {
        return somKaarten > 21;
    }

    public boolean hasBlackjack() {
        return somKaarten == 21;
    }

    public boolean wantNewCard() {
        System.out.println("Do you want a new card? If so type '" + inputForYes + "'");
        return isEqualsToYes();
    }

    public boolean wantsToPlayAgain() {
        System.out.println("Do you want to play again? If so type '" + inputForYes + "'");
        return isEqualsToYes();
    }

    private boolean isEqualsToYes() {
        return inputForYes.equals(scanner.nextLine().toLowerCase());
    }

    public int getJetons() {
        return jetons;
    }

    public void setJetons(int jetons) {
        this.jetons = jetons;
    }

    public void addJetons(int addJetons) {
        this.jetons = this.jetons + addJetons;
    }

    public void subtracktJetons(int subtracktJetons) {
        this.jetons = this.jetons + subtracktJetons;
    }

    public boolean enoughJetonsForBet(int wager) {
        return (this.jetons - wager) >= 0;
    }

    public void print() {
        System.out.println("Player has " + getSomKaarten() + " cardvalue total. And a minimum of " + getMinimum());
    }


}
