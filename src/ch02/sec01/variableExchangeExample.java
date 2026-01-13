package ch02.sec01;

public class variableExchangeExample {
    public static void main(String[] args){
        int x = 3;
        int y = 5;
        int i = x;
        x = y;
        y = i;

        System.out.println("x:" + x + ",y:" + y);
        System.out.printf("x: %d, y: %d\n", x,y);
        //d 는 정수 , f는 실수. 실수를 입력하면 에러가 뜬다.
        //
    }
}
