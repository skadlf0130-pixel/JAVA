package ch15.sec04;

import java.util.HashMap;
import java.util.Map;

public class HashMapMission {
    public static void main(String[] args) {
        //우리가 생성자를 사용하는 이유는?
        //객체생성과 동시에 멤버필드 초기화하기 위해

        ValueBox vb1 = new ValueBox(1,"권수영");
        ValueBox vb2 = new ValueBox(2,"권준하");
        ValueBox vb3 = new ValueBox(3,"김가은");
        ValueBox vb11 = new ValueBox(11,"임준이");

        //valueBox객체 주소값을 여러개 담을수 있는 배열을 만들어라.
        ValueBox[] valueBoxArr = new ValueBox[4];
        valueBoxArr [0] =vb1;
        valueBoxArr [1] =vb2;
        valueBoxArr [2] =vb3;
        valueBoxArr [3] =vb11;

        //배열 > hashMap key값은 id value 객체 주소값
        Map<Integer, ValueBox> map = new HashMap<>();
        for (int i = 0; i < valueBoxArr.length; i++) {
            map.put(valueBoxArr[i].id, valueBoxArr[i]);
        }
        System.out.println(map.get(1).name);
    }
}

class ValueBox {
    int id;
    String name;

    ValueBox(int id, String name){
        this.id = id;
        this.name = name;
    }
}