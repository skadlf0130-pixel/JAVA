package ch06.sec11;
/*
public    : 무조건 접근 가능.
protected : default + 상속관계에서 접급 가능
(default) : private + 같은 패키지 안이면 접근가능
private   : 같은 클래스 안에서만 접근 가능.

*/

public class SingleToneMain {
    public static void main(String[] args){
        SingleTone st = SingleTone.getInstance();
        SingleTone st2 = SingleTone.getInstance();

        System.out.println(st==st2);
    }
}
