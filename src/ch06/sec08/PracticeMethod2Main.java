package ch06.sec08;

import java.util.Arrays;

public class PracticeMethod2Main {
    public static void main(String[] args){
        PracticeMethod2 pm2 = new PracticeMethod2();

        String randomFileName = pm2.getRandomFileName();
        System.out.println("randomFileName: " +randomFileName);

        String originalFileName = "크크-dkd.dkd.ha.jpg";

        String ext = pm2.getExt(originalFileName);
        System.out.println("ext: " + ext);

        String rFilName2 = pm2.getRandomFileName(originalFileName);
        System.out.println("rFilName2: " + rFilName2);

        int[] arr ={10,5,8,11};
        int sum = pm2.sumArr(arr);
        System.out.println("sum: " + sum);

        int[] arr2 = pm2.deepCopy(arr);
        System.out.println(Arrays.toString(arr2));

    }
}
