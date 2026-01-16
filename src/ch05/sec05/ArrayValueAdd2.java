package ch05.sec05;

import java.util.Arrays;

public class ArrayValueAdd2 {
    public static void main(String[] args){
        //논리. 배열의 크기는 한번 정해지면 수정할수 없다.
        int[] arr= {2,4,8,10,11,12};
        //배열에 22를 추가

        int value =22;
        int idx = 2;

        int[] arr2 = new int[arr.length+1];

        arr2 [idx] = value;

        for(int i=0; i<idx; i++){
            arr2[i]=arr[i];
        }
        for(int i=idx; i<arr.length; i++) {
            arr2[i+1] = arr[i];
        }

      /*  for(int i=idx; i<arr.length; i++){
            arr2[ i < idx ? i : i + 1 ] =aar[i];
        }
       */
            System.out.println(Arrays.toString(arr2));

    }
}
