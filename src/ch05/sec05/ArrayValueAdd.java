package ch05.sec05;

import java.util.Arrays;

public class ArrayValueAdd {
    public static void main(String[] args){
        //논리. 배열의 크기는 한번 정해지면 수정할수 없다.
        int[] arr= {2,4,8,10};
        //배열에 22를 추가

        int[] arr2 = new int[arr.length +1];
        for(int i=0; i<arr.length; i++){
            arr2[i] = arr[i];
            arr2[arr.length] =22;
        }
        System.out.println(Arrays.toString(arr2));

    }
}
