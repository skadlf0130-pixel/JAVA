package blackjack;

public class Gamer {
    //게이머는 카드 객체 주소값 52개를 저장할 수 있다.
    protected Card[] cards = new Card[52];
    private int idx = 0;

    public void receiveCard(Card c1){
         cards[idx++] = c1;

    }

    public Card[] openCard() {
        //null이 없는 새로운 Card 배열을 만들어서 리턴
        Card[] temp =  new Card[idx];
        for(int i=0; i< temp.length; i++){
            temp[i] =cards[i];

        }
        return temp;
    }
}
