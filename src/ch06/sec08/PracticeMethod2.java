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

    public int[] deepCopy(int[] arr2){
        int[] arr3 = new int[arr2.length];
        for(int i=0; i<arr2.length; i++){
            arr3[i] = arr2[i];
        }
        return arr3;
    }
}









