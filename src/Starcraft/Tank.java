package Starcraft;

public class Tank extends Unit{
    private boolean isSiegeMode;

    @Override
    public String toString() {
        return "시즈탱크" + super.toString();
        //super. 을 붙이면 부모를 불러올수있다.
    }

    public void changeMode(){
        isSiegeMode = !isSiegeMode; //토글
        if(isSiegeMode){
            System.out.println("시즈모드 ON");
        } else  {
            System.out.println("시즌 모드 Off");
        }
    }

}
