
/*
class {}안에 코드 작성
컴파일 언어에서는 main메소드가 굉장히 특별한 메소드 >>> 프로그램 시작점
main메소드가 호출되면서 프로그램이 시작하게 된다.
자바에서는 main메소드 모양이 항상 같아야한다.
유일하게 달라도 되는 부분은 파라미터(매개변수) "args"만 바꿀 수 있다. 나머지는 그대로 작성해야 한다.
 */

public class Main {
    public static void main(String[] args) {

        //JS의 console.log 랑 비슷하다. 개행을 해주지 않는다.
        //System.out.printf("Hello and welcome!");
        //만약 개행을 하고 싶을땐, prinln 메소드 호출로 해결
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
         //자바는 타입을 엄격하게 구분
            System.out.println("i = " + i);
        }
    }
}