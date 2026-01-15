package ch05.sec05;

public class FindMaxArray {
    public static void main(String[] args){
        int[] arr = {10, 8, 88, 1, 100, 14, 200};
        int Max = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>Max){
                Max= arr[i];
            }
        }
        System.out.println("Max:" +Max);
    }
}
