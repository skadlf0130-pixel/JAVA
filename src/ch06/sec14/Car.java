package ch06.sec14;

public class Car {
    /*
    은닉화 혹은 캡슐화. 맴버필드를 private으로 외부접근을 막는다.
    private한 멤버필드에 값 넣는 방법.

     */
    private String model;
    private int speed;

    //1. 생성자 이용.
    //2. 메소드 이용.(Setter)
    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    /*
    Setter을 만드는 방법
    메소드명 set으로 시작 + 필드명
    리턴타입은 void( 값은 받기만 하지 리턴 하진 않는다.)
    파리미터는 필드의 타입과 동일하게 한다.
    전달받은 값을 필드에 대입한다.

     setter가 있으면 mutable이다. 수정가능.
     setter가 없으면 immutable이다. 수정불거능.초
     */
    public void setModel(String model){
        this.model = model;
        }
    //speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    /*
    private한 멤버필드에 값 빼는 방법.
    1.메소드 이용(Getter)
     */

    public String getModel(){
        return this.model;
    }
    public int getSpeed(){
        return this.speed;
    }


}
