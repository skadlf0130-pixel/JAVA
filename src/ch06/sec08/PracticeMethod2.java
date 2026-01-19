package ch06.sec08;

import java.util.UUID;

public class PracticeMethod2 {

    public String getRandomFileName(){
        return UUID.randomUUID().toString();


    }
    public String getExt(String name){
        int idx  = name.lastIndexOf(".");
        String idx2 = name.substring(idx);
        return idx2;
    }
    //public String getExt(String name){
    // return name.substring(name.lastIndexOf("."));
    // 실무에서 많이 쓰는 법
    public String getRandomFileName(String rfile){
        return getRandomFileName() + getExt(rfile);
        }


    public int sumArr(int[] arr){
        int k=0;
        for(int i=0; i<arr.length; i++){
         k = k+ arr[i];
        }
      return k ;
    }

    public int[] deepCopy(int[] arr){
        int[] arr2 = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public int getMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max= arr[i];
            }
        }
        return max;
    }
}









