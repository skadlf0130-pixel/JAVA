package blackjack;

public class BlackjackMain {
    public static void main(String[] args) {
        System.out.println("-------최초------");
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        dealer.needMoreCard();

        Card c1 = cd.draw();
        gamer.receiveCard(c1);

        Card[] gamerCards = gamer.openCard();

    }
}
