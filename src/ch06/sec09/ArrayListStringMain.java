package ch06.sec09;

import java.util.Arrays;

public class ArrayListStringMain {
    public static void main(String[] args){
        ArrayListString list = new ArrayListString();

        System.out.println(Arrays.toString(list.arr));
        list.add("하하");
        System.out.println(Arrays.toString(list.arr));
        list.add("텔레토비");
        System.out.println(Arrays.toString(list.arr));
        list.add("보라돌이");
        System.out.println(Arrays.toString(list.arr));
        list.add("뚜비");
        System.out.println(Arrays.toString(list.arr));
        list.add("나나");
        System.out.println(Arrays.toString(list.arr));
        list.add("뽀");
        System.out.println(Arrays.toString(list.arr));




        String val = list.get(1);
        System.out.println("val: "+ val);

        String removeVal = list.removeVal();
        System.out.println("removeVal: " +removeVal);
        System.out.println(Arrays.toString(list.arr));

        list.add(1,"나야");
        System.out.println(Arrays.toString(list.arr));

        String removeVal2 = list.remove(2);
        System.out.println("removeVal2: " +removeVal2);
        System.out.println(Arrays.toString(list.arr));

        String removeVal3= list.get(1);
        System.out.println("removeVal3: " +removeVal3);
        list.remove(removeVal3);
        System.out.println(Arrays.toString(list.arr));




    }
}
// this. 속성과 메소드 사용
// this() 생성자 호출