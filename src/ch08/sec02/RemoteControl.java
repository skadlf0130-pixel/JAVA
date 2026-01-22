package ch08.sec02;

public interface RemoteControl {
    //멤버필드를 작성
    //필드 선언 앞에 public static final이 자동으로 들어간다
    int MIN_VOLUME =0;
    int MAX_VOLUME =10;

    /*
    메소드 선언 앞에 public abstract 가 항상 자동으로 들어간다.
    고로, 인터페이스에서는 리턴타입 메소드명 파라미터만 적어주면된다.
    */
    void turnOn();
    void volumeUp();
    void volumeDown();
    void mute();// 음소거
}
