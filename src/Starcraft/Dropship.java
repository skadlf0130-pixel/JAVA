package Starcraft;

public class Dropship extends Unit {
    //8개의 유닛을 태울 수 있는 공간이 필요
    private Unit[] units = new Unit[8];
    private int idx = 0;

    public void load(Unit unit){
        if(idx == units.length){
            return;
        }
        units[idx++] = unit;
    }

    public void check(){
        for(int i=0; i< units.length; i++){
            System.out.printf("[%d]: %s\n",i, units[i]);
        }
    }

    public Unit unload (int unload) {

        Unit temp = units[unload];
        for (int i = unload+1 ; i < units.length; i++) {
            if (units[i] == null) {
                break;
            }
            units[i - 1] = units[i];
        }
        units[--idx] = null;
        return temp;
    }
}

