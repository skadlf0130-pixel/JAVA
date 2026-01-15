package ch04.sec02;

/*
숫자를 입력해 주세요(종료:0)>>5
숫자를 입력해 주세요(종료:0)>>10
숫자를 입력해 주세요(종료:0)>>3
숫자를 입력해 주세요(종료:0)>>0
합계가 나오게 하기
 */


import java.util.Scanner;

public class SumProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int sum = 0;
        while(true){
            System.out.println("숫자를 입력해 주세요(종료: 0) >> ");
            String choice = scanner.nextLine();

            if("0".equals(choice)){
                break;
            } else {
                int i = Integer.parseInt(choice);
                sum = sum + i;
            }
        }
        System.out.println("합계: "+ sum);
    }

}
