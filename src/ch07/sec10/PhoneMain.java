package ch07.sec10;
/*
추상클래스란 class키워드 앞에 abstract 들어간 클래스를 의미한다.
 */
public class PhoneMain {
    public static void main(String[] args){
        Phone p = new SmartPhone();
        p.bell();
    }

}
