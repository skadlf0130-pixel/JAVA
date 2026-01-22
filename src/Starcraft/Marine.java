package Starcraft;

public class Marine extends Unit{
    void stimPack(){
        System.out.println("스팀팩을 사용한다.");
    }

    @Override
    public String toString() {
        return "마린" + super.toString();
    }
}

