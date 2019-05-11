package beginnercoursettwo.les05;

public class BlackJackMain {

    public static void main(String[] args) {

        //toDo see if can't refactor!

        PlayingBlackjack playingBlackjack = new PlayingBlackjack();
        System.out.println("Welcome to the blackjackGame!");
        Player player = playingBlackjack.getPlayer();

        while (player.sumLessThenMinimum()) {
            System.out.println("The player does not have " + player.getMinimum() + " yet. Is " + player.getSomKaarten());
            player.addCard(playingBlackjack.drawCard());
        }
        System.out.println("The total sum of the cards is: " + player.getSomKaarten());

        if (player.hasBlackjack()) {
            System.out.println("Congratulations, you’ve won with a blackjack!");
        } else if (player.moreThen21()) {
            System.out.println("Too bad, you lose!");
        } else {
            while (!player.moreThen21() && !player.hasBlackjack()) {
                if (player.wantNewCard()) {
                    player.addCard(playingBlackjack.drawCard());
                    System.out.println("You have now "+player.getSomKaarten());
                } else {
                    break;
                }
            }

            if (player.moreThen21()) {
                System.out.println("Too bad, you lose!");
            } else if (player.hasBlackjack()) {
                System.out.println("Congratulations, you’ve won with a blackjack!");
            } else {
                Player dealer = playingBlackjack.getDealer();
                while (dealer.sumLessThenMinimum()) {
                    System.out.println("The dealer does not have " + dealer.getMinimum() + " yet. Is " + dealer.getSomKaarten());
                    dealer.addCard(playingBlackjack.drawCard());
                }

                System.out.println("The total sum of the cards for dealer is: " + dealer.getSomKaarten());

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


    }

}
