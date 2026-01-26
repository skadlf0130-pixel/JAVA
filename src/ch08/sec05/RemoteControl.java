package ch08.sec05;

public interface RemoteControl {
    //[public static final] 안 적어도 앞에 자동으로 붙는다.
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //[public abstract] 안 적어도 앞에 자동으로 붙는다.
    void setVolume(int volume);

    // 인터페이스도 추상클래스처럼 구현부가 있는 메소드 만들수 있었으면 좋겠다.
    // 디폴트 메소드
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제");
        }
    }
    // 스테틱 메소드(클래식 메소드)는 가질 수 없다.
    // 인터페이스만 스테틱이 안붙은 메소는 사용 할 수 없다.
    static void changeBattery(){
        System.out.println("베터리 교환");
    }

    // private 일반 메소드, private static 메소드
    // -> default, static 메소드가 여러개 일 때 중복처리를 메소드로 처리하기 위해 존재
    // 내부에서만 사용가능
    private void defaultCommon(){
        defaultStaticCommon(1);
        return ;
    }

    // 스테틱(static)은 추상메소드를 만들 수 없다.
    // 스테틱은 바로 호출가능하다고 보면 된다.
    // 단 반대로는 안된다. static이 안붙은 거를 static이 불러 올 수 없다.
    private static void defaultStaticCommon(int n1){

    }
}
