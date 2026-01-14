package ch04.sec02;

public class SumFor {
    public static void main(String[] args){
        int sum = 0;
        for(int i=1; i<=100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
