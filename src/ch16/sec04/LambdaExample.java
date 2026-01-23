package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
      Person p = new Person();

        // Calculable을 implements한 객체 주소값을 action메소드에
        // 아규먼트로 보내준다. 10.0, 12.2 계산은 더하기로 한다.
        Calculable c1 = (x,y) -> (x + y);
        p.action(c1,10.0,12.2);
        // 한 공식(+,-,%, * 중)을 계속 사용한다면 위에공식으로 사용하는게 좋다
        // 위 아래는 같은내용. 람다식.
        p.action((x,y) -> (x + y), 10.0,12.2);

    }
}
