package ch02.sec01;

public class OverValue {
    public static void main(String[] args){
        byte b1 = -128;
        System.out.println("b1: " +b1);
        // byte b2 = -129; 안된다. 그릇이 1L인데 1.1L을 넣는거랑 같다.
        byte b3 = 127;
        System.out.println("b3: "+ b3);
        // byte b4 = 129; 안된다. 그릇이 1L인데 1.1L을 넣는거랑 같다.

        //정수 리터럴은 기본적으로 int타입. l,L을 붙여서 long타입으로 변경(대부분 대문자로 작성)
        long l1 = 1_000_000_000_000L; //L = long
        System.out.println("l1: "+ l1);
        // long l2 = 9_300_000_000_000_000_000L;  안된다. 그릇이 10L인데 10.1L을 넣는거랑 같다.

        long l2 = 2_147_483_647;
        //int가 저장할 수 있는 값은 L을 안붙여도된다. 저장하는 값을 넘어가면 L을 붙여준다.

        //실수 리터럴은 기본적으로 더블타입. d, D를 붙여도 되고 안 붙여도 된다.
        double d1 = 10.1;

        //float f1 = 10.1; 더큰쪽에서 작은쪽으로 데이터를 옮길 때는 자동형변환이 되지 않는다.
        float f2 = 10.1f; // 리터럴에 f,F를 붙이면 float타입의 리터럴이 된다.
        double d2 = f2;   // 자동형변환이 된다. float > double 타입으로 변경. 작을쪽에서 큰쪽으로 자동형변환.

        long l3 = 100_000_000_000_000L;
        float f3 = l3; // float, double은 지수계산으로 저장하기 때문에 아주 큰 값도 저장가능. 하지만 정확도는 조금 낮다

        // byte → short → int → long → float → double
        // 죄측에서 우측으로는 자동형변환 가능
        // 우측에서 좌측으로는 자동현변환 불가능

        long l4 = 10L;
        int i4 = (int)l4; //강제형변환
        System.out.println("l4: "+l4);
        System.out.println("i4: "+i4);

        //byte -128~127범위의 값을 저장
        int i2 = 128;
        byte b4 = (byte)i2; // 오버플로우
        System.out.println("b4: "+ b4);

        int i3 = -129;
        byte b5 = (byte)i3; // 언더플로우
        System.out.println("b5: "+b5);


    }
}
