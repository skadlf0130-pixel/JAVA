package ch07.sec10;
// 폰 클래스를 상속받아 주세요
// SmartPhone 뒤에  extends Phone 을 적어준다.
// 적어준뒤 상속받을 코드 불러온다.
public class SmartPhone extends Phone {
    public void bell() {
        System.out.println("스마트 폰이 울린다.");
    }
}
