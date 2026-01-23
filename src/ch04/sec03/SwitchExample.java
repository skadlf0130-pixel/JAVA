package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6)+1;
        System.out.println("num: " +num);

        // break가 없다면 계속 실행된다.
        // case 안에 조건식을 넣지 않는다 ()안에넣기
        switch (num % 2 ){
            case 1:
                System.out.println("홀수"); break;
            default:
                System.out.println("짝수"); break;


        }
    }
}
