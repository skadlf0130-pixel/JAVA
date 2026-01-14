package ch04.sec02;

public class PrintStarRectangle {
    public static void main(String[] args){
        int str = (int)(Math.random()*4.0)+3;

        for(int i=1; i<=str; i++) {
            for (int j = 1; j <= str; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
