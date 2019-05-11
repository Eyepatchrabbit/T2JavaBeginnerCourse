package beginnercoursettwo.les05;

import java.util.Scanner;

public class Player {

    private int somKaarten;

    private int minimum;

    private Scanner scanner;

    private String inputForYes="y";

    public Player(int kaart1, int kaart2, int minimum) {
        //2 kaarten in begin krijgen
        this.somKaarten = kaart1 + kaart2;
        this.minimum = minimum;
        this.scanner=new Scanner(System.in);
    }

    public int getSomKaarten() {
        return somKaarten;
    }

    public void addCard(int nieuweKaart) {
        if (nieuweKaart==11 && ((somKaarten+nieuweKaart)>21)){
            nieuweKaart=1;
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

    public boolean hasBlackjack (){
        return somKaarten==21;
    }

    public boolean wantNewCard(){
        System.out.println("Do you want a new card? If so type '"+inputForYes+"'");
        return isEqualsToYes(scanner.nextLine().toLowerCase());
    }

    public boolean wantsToPlayAgain(){
        System.out.println("Do you want to play again? If so type '"+inputForYes+"'");
        return isEqualsToYes(scanner.nextLine().toLowerCase());
    }

    private boolean isEqualsToYes(String yesOrNo){
        return yesOrNo.equals(inputForYes);
    }


}
