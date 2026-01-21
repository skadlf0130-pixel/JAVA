package blackjack;

public class CardDeck {
    //Card 객체 주소값 52개를 담을 수있어야 한다.
    private Card[] cards = new Card[52];
    private String[] patterns = {"스페이드","하트","클로버","다이아"};
    private int drawIdx = 0; // 외부로 카드를 준 idx 관리

    //CardDeck을 기본생성자로 호출만 하여도
    //Card객체 52개를 생성하여 cards가 가리키는
    //배열에 순차적으로 저장(대입)한다.
    //가능하면 무늬별로 다른 denomination값이 저장.

    public CardDeck() {
        init(); // 안에 내용을 불러오는 메소드 역할
        shuffle();// 카드 섞기
    }
    public void print() { //검증용!
        for (int i = 0; i < cards.length; i++) {
            Card c = cards[i];
            if (c == null) {
                System.out.println("null");
            } else {
                System.out.printf("%s - %s\n", c.getPattern(), c.getDenomination());
            }
        }
    }
    private  void init(){
        int idx = 0;
        for(int i=0; i<patterns.length; i++ ){ //4번 반복 for문
            String pattern = patterns[i];

                for(int d=1; d<=13; d++){ //13번 반복 for문
                String denomination = null; // 정수 > 문자열

                switch (d){
                    case 1 : denomination = "A";break;
                    case 11 : denomination = "J";break;
                    case 12 : denomination = "Q";break;
                    case 13 : denomination = "K";break;
                    default: denomination = String.valueOf(d); //정수를 문자열로 바꿔서 입력하는 코드
                }
                Card c = new Card(pattern,denomination);
                cards[idx++] = c;
            }
        }


    }
    private void shuffle(){
        for(int i=0; i< cards.length; i++){
            int randomIdx = (int)(Math.random()* cards.length);

            //i방과 randomIdx방의 값을 서로 스와핑한다(바꿔준다).
            Card temp =cards[i];
            cards[i] = cards[randomIdx];
            cards[randomIdx] = temp;

        }
    } //int idx = 0;
    public Card draw() {
        //수빈방법!
        // cards의 방에 들어있는 card주소값을 순차적을 리턴해주며 리턴한 방은 null로 바꾼다.
        //Card s=cards[idx];
        //cards[idx]=null;
        //idx++;
        //return s;
//   draw호출하면 0번방값 리턴해주고 0번방을 null로 바꾼다 그리고 idx++해줘서 idx는 1이된다
//   호출할때마다 반복 그러면 idx값은 계속 올라가고 idx번방 값을 리턴도 계속 해준다


        if (drawIdx > 51) {return null;}
        Card temp = cards[drawIdx];
        cards[drawIdx++] = null;
        return temp;
    }

}
