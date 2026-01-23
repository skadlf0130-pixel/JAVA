package ch15.sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    /*
    배열은 크기가 고정. 크기 변경이 안된다.
    크기변경해서 사용하고 싶으면 새로운 배열을 만들어서
    복사도 하고 값도 넣고 써야했다.

    한 곳에 여러갑을 담을 수 있는 친구들을 Collection이라고 한다.
    배열, ArrayList, LinkedList, HashMap, Set 등등


     */

    public static void main(String[] args) {
        // List<String>는 유연한 배열인데 각 방의 타입이 String
        // <>안에는 레퍼런스타입만 가능
        // <>안에 있는 타입이 add에 담겨있는 타입
        //

        List<String> list = new ArrayList<>();
        list.add("하하");
        list.add("후후");
        list.add("크크");

        String srt = list.get(0);
        list.remove(list.size() -1); //방 지초우기
        System.out.println(list);

        /*
        질문1. List에  ArrayList를 담을 수있는가?
        -> 상속관계라서 가능!

        질문2. List가 부모타입?
        -> 자식이 부모를 담을 수 없다. 고로 부모타입

        질문 3. List >> interface

         */
        //Wrapper 클래스 : primitive타입의 클래스형
        List<Integer> list2 = new ArrayList<>();
        //list2.add("하하"); 불러오는 값에 String이 올 수 없다.
        //같은타입을 넣을 수 있다.
        list2.add(10);
        list2.add(20);
        list2.add(30);



    }
}
