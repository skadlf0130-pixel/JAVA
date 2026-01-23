package ch04.sec03;

public class SwitchExpressionExample2 {
    public static void main(String[] args) {

        String grade ="VIP"; // VIP, GOLD, NORMAL
        /*
        VIP    가격 10%할인 가격  >> 1000
        GOLD   가격  5%할인 가격  >>  500
        NORMAL 할인 없음 원래가격  >>    0

         */

        int price = 10_000;

        int buyPrice = switch (grade){
            case "VIP" -> {
                int a = (int)(price * 0.1);
                yield a;
            }
            case "GOLD" -> {
                int b = (int)(price *0.05);
                yield b;
            }
            default -> {
                yield 0;
            }
        };
        System.out.println("buyPrice: "+ buyPrice);


    }
}
