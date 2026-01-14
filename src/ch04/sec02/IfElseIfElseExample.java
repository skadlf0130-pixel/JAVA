package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args){
        int score = (int)(Math.random() * 81.0)+20;
        /* 90~100점 이상 A등급 출력
           80~89점 이상 B등급 출력
           70~79점 이상 C등급 출력
           나머지 D등급 */
        String result = "D";
        if(score >= 90) {
            result = "A등급";
        } else if (score >= 80) {
            result = "B등급";
        } else if (score >= 70) {
            result = "C등급";
        }
    }
}
