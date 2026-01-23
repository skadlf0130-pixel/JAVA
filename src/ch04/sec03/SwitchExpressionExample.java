package ch04.sec03;

public class SwitchExpressionExample {
    public static void main(String[] args) {

        //스위치 표현식 결과값을 리터해야할 때 좋다
        // 주의! 스위치 표현식은 default가 필수
        int num = (int)(Math.random()*13)+1;
        System.out.println("num: "+ num);

        // yield는 switch 표현식 안에서 값을 돌려주기 위한 키워드입니다
        // 한 줄이면 -> , 여러 줄 로직이면 yield
        // 블록 {} 안에서는 yield 필수
        String denomination = switch (num){
          case 1-> "A";
          case 11 -> "J";
          case 12 -> {
              int a = 10;
              int b = 20;
              yield "Q"; // switch문 안에서 연산하고 return하고 싶을때 return 값은 yield를 적어야한다.
          }
          case 13 -> "K";
          default -> String.valueOf(num);
        };
        System.out.println("denomination: "+ denomination);
    }
}
