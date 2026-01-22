package ch08.sec08;

public class MultiInterfaceMain {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        SmartTelevision st = (SmartTelevision)  rc;
        st.turnOn();
        st.turnOff();
        st.search("www.naver.com");

        //인터페이스는 객체화 불가!
        //아래는 클래스 이름이 없는 구현 클래스를 만들고 바로 객체화한다.
        //일회용
        RemoteControl rc2 = new RemoteControl() {
            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }
        };

    }
}
