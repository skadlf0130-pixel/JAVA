package ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args){
        int x = 100;
        //x = x * -1;
        x = -x;
        System.out.println("1.x: " + x ); // -100
        System.out.println("2.x: " + -x ); // 100
        // x= -x;
        System.out.println("3.x: " + x ); // -100


    }
}
