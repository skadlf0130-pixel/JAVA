package ch06.sec08;

public class PracticeMethodMain {
    public static void main(String[] args) {
        //PracticeMethod 객체화 해주세요.
        PracticeMethod pm = new PracticeMethod();
        pm.abs(10); //10
        pm.abs(-10); //10
        pm.abs(-8); //8

        int r1 = pm.random(10); //0~9랜덤값 리턴
        int r2 = pm.random(20); //0~19랜덤값 리턴

        System.out.println("r1: " + r1 + ", r2: " + r2);

        int r3 = pm.random(2, 10); //2~9 랜덤값 리턴
        int r4 = pm.random(10, 15); //10~14 랜덤값 리턴

        /*90점 초과는 콘솔에 "A', 80점 초과는 "B", 나머지는 "C'리턴*/
        String grade = pm.getGrade(80);
        System.out.println("grade: " + grade);

        pm.printStar(5);
        pm.printStar(3);

        System.out.println("--------");
        pm.printStarTriangle(4);

        System.out.println("--------");
        pm.printStarRectangle(6);

        System.out.println("--------");
        pm.gugudan(5);

        System.out.println("--------");
        pm.gugudan(3,6);

        System.out.println("--------");
        int sum = pm.sum(10, 50);
        System.out.println("sum " + sum);


    }

}