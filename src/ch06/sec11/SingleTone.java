package ch06.sec11;
/*
싱글톤 : 프로젝트에서 단 하나의 객체만 만들어서 사용할 수 있도록
구조를 만드는 것

1. 외부에서 객체 생성을 할 수 없다.
2. SingleTone객체를 담을 수 있는 static변수 필요.
3. 외부에서 객체 주소값을 얻을 수 잇는 static메소드 필요.
 */
public class SingleTone {
    static SingleTone singleTone = null; // 2번
    // static SingleTone singleTone = new SingleTone(); 명시화
    String name;
    int age;

    private SingleTone() {} //1번

    static SingleTone getInstance() { //3번
    /*
    만약, SingleTone static 맴버필드가 null이라면 singleTone을
    객체화 하여 주소값을 담아 준다.
    singleTone에 담겨져 있는 주소값을 리턴한다.
     */
     if(singleTone == null){
         singleTone = new SingleTone();
     }
        return singleTone; //명시화를 하면 리턴만 작성하면 된다.
    }
}
