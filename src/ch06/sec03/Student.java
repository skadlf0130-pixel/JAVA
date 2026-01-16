package ch06.sec03;
/*
객체는 무엇으로 이루어져있는가?
속성 : 멤버필드 ,전역 (변수 아니면 상수)
속성의 역할 : 값저장, 객체가 살아있는 동안 값이 유지
메소드 : 멤버메소드
메소드의 역할 : 값 변화 action

클래스는 객체가 아니라 틀(Frame)이다. 설계도 같은 역할.
클래스로 실체를 만들면 그게 객체(object, instance)가 된다.


작성순서는 아래순서로
멤버필드
생성자
메소드


★ 생성자 vs 메소드 다른점 2가지
1. 이름은 클래스명과 동일.
2. 리턴타입이 작성하면 안된다.

생성자의 역할 : 객체 생성 + 멤버필드 초기화

 */
public class Student {
    int no;
    String name;

    public Student(){ // 기본 생성자 정의
        no = 0;
        name = "홍길동";
        System.out.println("------Student 기본생성자----");
    }

    void introduceMySelf(){
        System.out.printf("저는 %d번이고 이름은 %s입니다.\n", no,name);

    }
}
