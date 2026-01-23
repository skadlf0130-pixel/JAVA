package ch16.sec01;

public class Main {
    public static void main(String[] args) {
        /*
        인터페이스 사용방법
        1. (이름이 있는)클래스로 구현. like CalcSum 클래스
        */
        Calculable c1 = new CalcSum();
        c1.calculable(10,20);

        // 2. 익명 클래스로 구현(일회용)
       Calculable c2 = new Calculable() {
           @Override
           public void calculable(int x, int y) {
               System.out.println( x * y);
           }
       };
       c2.calculable(10,20);

        // 3. 람다식을 이용 (일회용)2번과 같은데 작게 작성
        // 람다식 = 익명 함수(메서드)를 간단히 표현한 것
        // 람다식을 사용할수 있는 조건.
        // 인터페이스가 추상메소드가 단 1개만 있을 때 사용가능
        Calculable c3 = (x, y) -> System.out.println( x * y );
        c3.calculable(10,20);



    }
}
