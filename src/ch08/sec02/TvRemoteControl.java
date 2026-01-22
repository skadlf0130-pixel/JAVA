package ch08.sec02;
/*
인터페이스란? 이 기능을 반드시 제공해야 한다는 약속(규칙)
인터페이스를 상속받을 땐 implements 키워드를 사용.
그리고 인터페이스를 상속받는다고 표현하지 않고 구현한다하고 한다.
인터페이스에 적힌 “약속(메서드)”을
이 클래스가 전부 구현하겠다는 선언
 */
public class TvRemoteControl implements RemoteControl {
    private int volume = MIN_VOLUME;
    private int mVolume;

    @Override
    public void turnOn() {
        System.out.println("Tv를 켠다.");
    }

    @Override
    public void volumeUp() {
         if(volume < MAX_VOLUME){
             volume++;
         }
        System.out.println("volume: " +volume);
    }

    @Override
    public void volumeDown() {
        if(volume>MIN_VOLUME){
            volume--;
        }
        System.out.println("volume: " +volume);
    }

    @Override
    public void mute() {
        if(volume>MIN_VOLUME){
            mVolume = volume;
            volume = MIN_VOLUME;
        } else {
            volume = mVolume;
        }
        System.out.println("volume: " +volume);
    }


    public void turnOff() {
        System.out.println("Tv를 끄다.");
    }
}
