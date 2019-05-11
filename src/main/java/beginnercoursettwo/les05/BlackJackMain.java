package beginnercoursettwo.les05;

public class BlackJackMain {

    public static void main(String[] args) {
        System.out.println("Welcome to the blackjackGame!");
        boolean wantsToPlay;

        do {
            wantsToPlay = playAGame();
        } while (wantsToPlay);
        System.out.println("Game closed. Hope you had fun! :) ");
    }

    public static boolean playAGame() {
        PlayingBlackjack playingBlackjack = new PlayingBlackjack();

        Player player = playingBlackjack.getPlayer();

        while (player.sumLessThenMinimum()) {
            System.out.println("The player does not have " + player.getMinimum() + " yet. Is " + player.getSomKaarten());
            player.addCard(playingBlackjack.drawCard());
        }
        System.out.println("The total sum of the cards is: " + player.getSomKaarten());

        if (player.getSomKaarten() >= 21) {
            blackjackOrAbove(player);
        } else {
            while (!player.moreThen21() && !player.hasBlackjack()) {
                if (player.wantNewCard()) {
                    player.addCard(playingBlackjack.drawCard());
                    System.out.println("You have now " + player.getSomKaarten());
                } else {
                    break;
                }
            }

            if (player.getSomKaarten() >= 21) {
                blackjackOrAbove(player);
            } else {
                dealerTurn(playingBlackjack);

                itsTheFinalShowdown(playingBlackjack);
            }
        }

        return player.wantsToPlayAgain();
    }

    private static void blackjackOrAbove(Player player) {
        if (player.hasBlackjack()) {
            System.out.println("Congratulations, you’ve won with a blackjack!");

        } else if (player.moreThen21()) {
            System.out.println("Too bad, you lose!");
        }
    }

    private static void dealerTurn(PlayingBlackjack playingBlackjack) {
        Player dealer = playingBlackjack.getDealer();

        while (dealer.sumLessThenMinimum()) {
            System.out.println("The dealer does not have " + dealer.getMinimum() + " yet. Is " + dealer.getSomKaarten());
            dealer.addCard(playingBlackjack.drawCard());
        }
        System.out.println("The total sum of the cards for dealer is: " + dealer.getSomKaarten());
    }

    private static void itsTheFinalShowdown(PlayingBlackjack playingBlackjack) {
        Player player = playingBlackjack.getPlayer();
        Player dealer = playingBlackjack.getDealer();

        if (dealer.moreThen21()) {
            System.out.println("Congratulations, you’ve won! The dealer has more than 21!");
        } else if (dealer.hasBlackjack()) {
            System.out.println("Too bad, the dealer has a blackjack!");
        } else if (dealer.getSomKaarten() < player.getSomKaarten()) {
            System.out.println("Congratulations, you’ve won!");
        } else {
            System.out.println("Too bad, you lose!");
        }
    }

}
