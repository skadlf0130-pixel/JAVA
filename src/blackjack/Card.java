package blackjack;

public class Card {
    // 무늬pattern (스페이스 하트 클로버 다이아 중 한 값
    // 숫자denomination (A, 2~10, J,Q,K 중에 한값을 담을 수 있어야한다.
    // 무늬, 숫자 값 하나씩 저장 할수 있는 카드 클래스를 만들기. 단, 객체 생성 이후 변경불가
    private String pattern;
    private String denomination;

    public Card (String pattern, String denomination){
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern(){
        return this.pattern;
    }
    public String getDenomination(){
        return this.denomination;
    }

    @Override
    public String toString(){
        return String.format("Card - %s(%s)", pattern, denomination);
    }



}
