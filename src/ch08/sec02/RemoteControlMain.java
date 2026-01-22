package ch08.sec02;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl rc = new TvRemoteControl();
        rc.turnOn();

        // turnOff 호출
        //()를 이용해서 강제 형변환!!!!!
        TvRemoteControl trc = (TvRemoteControl)rc;
        trc.turnOff();

        rc.volumeUp();
        rc.volumeUp();
        rc.volumeDown();




    }
}
