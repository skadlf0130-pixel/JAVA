package blackjack;

public class Rule { //객체화없이 불러오기 위해선 static을 꼭 사용!
    //2~10은 숫자 그대로 점수 K,Q,J는 10점으로 A=1로 계산
    //카드들의 모든 점수를 합하고 합한수 리턴
    public static int calcScore(Card[] cards){
        int sum = 0;
        for(int i=0; i<cards.length; i++){
            String d = cards[i].getDenomination();
            switch (d){
                case "A" : sum += 1; break;
                case "Q":
                case "J":
                case "K": sum += 10; break;
                default: sum += Integer.parseInt(d); break;
            }
        }
        System.out.println(sum);
        return sum;

    //int totalScore = 0;
    //for(Card card : cards) {
    //    String denomination = card.getDenomination();
    //  int score =
    }
    public static void whoIsWinner(Dealer dealer, Gamer gamer){
       int dealerScore = calcScore(dealer.openCard());
       int gamerScore = calcScore(gamer.openCard());


        /*
        둘의 점수가 같다 거나 21점 초과 > 무승부
        달러가 21점 초과, 게이머 21점 이하 > 게이머 승
        게이머가 21점 초과, 딜러가 21점 이하 > 딜러 승
        둘다 21점 초과가 아니고, 게이머가 딜러보다 점수 높다 > 게이머승
         */
        if((dealerScore == gamerScore) || (dealerScore > 21 && gamerScore>21)){
            System.out.println("무승부");
        } else if (dealerScore >21 && gamerScore<=21) {
            System.out.println("게이머 승");
        } else if (gamerScore>21 && dealerScore<=21) {
            System.out.println("딜러 승");
        } else if (gamerScore>dealerScore) {
            System.out.println("게이머 승");
        } else {
            System.out.println("딜러 승");
        }
    }
}

