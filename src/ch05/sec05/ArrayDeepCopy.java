package ch05.sec05;

import java.util.Arrays;

public class ArrayDeepCopy {
    public static void main(String[] args){
       int[] arr = {10, 8, 88, 1, 100, 14, 200};
       int[] arr2 = arr;

       arr2[1]= 77;
        // Arrays.toString()
        // :배열 안의 값을 한 번에 문자열 형태로 보기 좋게 출력해주는 메서드
        // 즉, 배열 내용을 사람이 읽을 수 있게 출력
       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(arr2));
       System.out.println(arr == arr2);

        System.out.println("-----------");
        // arr과 똑같은 값을 가지고 있는 새로운 배열을 만든다.
        // 1. 첫번째 해야하는 일 - 생성. 똑같은 크기의 배열을 만들어야 한다.
        int[] arr3 = new int[arr.length];
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr == arr3);

        for(int i=0; i<arr.length; i++){
            arr3[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr3));

    }
}
