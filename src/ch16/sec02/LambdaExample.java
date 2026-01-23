package ch16.sec02;

public class LambdaExample {
    public static void main(String[] args) {
        //Person
        Person p = new Person();

        // action을 호출하면서 Workable을 implement한 객체 주소값을 전달
        // 1. (이름있는)클래스 이용
        Workable w1  = new Mechanic();
        p.action(w1);

        // 2번 (익명)
        Workable w2 = new Workable() {
            @Override
            public void work() {
                System.out.println("청소부가 청소를 열심히 한다.");
            }
        };
        p.action(w2);
        p.action(new Workable() {
            @Override
            public void work() {
                System.out.println("청소부가 청소를 열심히 한다.2");

            }
        });
        // 3번 람다식
        Workable w3 = ()-> System.out.println("강사가 열심히 강의를 한다.");
        p.action(w3);
        p.action(()-> System.out.println("강사가 열심히 강의를 한다.2"));

    }
}
// 추상메소드를 오버라이딩 하지 않으면 빨간줄!
class Mechanic implements Workable{

    @Override
    public void work() {
        System.out.println("정비공이 정비를 합니다.");
    }
}
