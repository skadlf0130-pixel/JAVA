package blackjack;

public class GameStart {
    public static void main(String[] args){
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        // 딜러와 게이머는 순차적으로 카드를 하나씩 뽑아
        // 각자 2개의 카드를 소지한다.

        dealer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());

        // 딜러가 가지고 있는 카드의 정수가 16점 이하면
        // 카드 한장 더 소지하게 한다.
        if(dealer.needMoreCard()) {
            dealer.receiveCard(cd.draw());
        }

        dealer.showYourCards();
        System.out.println("----딜러----");
        for(Card c : dealer.openCard()){
            System.out.println(c);

        }
        gamer.showYourCards();
        System.out.println("----게이머----");
        for(Card c : gamer.openCard()){
            System.out.println(c);
        }
        //게이머에게

        //비교, 누가 이겼나?
        Rule.whoIsWinner(dealer, gamer);


    }
}
