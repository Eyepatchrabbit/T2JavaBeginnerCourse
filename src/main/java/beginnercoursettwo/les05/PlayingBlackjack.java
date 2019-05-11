package beginnercoursettwo.les05;

import java.util.Random;

public class PlayingBlackjack {

    private Player player;
    private Player dealer;

    public PlayingBlackjack() {
        //first see for player himself
        player = new Player(drawCard(), drawCard(), 16);

        //see for Dealer (player !blackjack and not over 21)
        dealer = new Player(drawCard(), drawCard(), 17);
    }

    public Player getPlayer() {
        return player;
    }

    public Player getDealer() {
        return dealer;
    }

    public int drawCard() {
        //return number between 2 and 11
        return new Random().nextInt(10) + 2;
    }


}
