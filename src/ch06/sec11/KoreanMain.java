package ch06.sec11;

public class KoreanMain {
    public static void main(String[] args){
        Korean k1 = new Korean("990124-4112233","김미정");
        k1.name = "김미향";
        // k1.ssn = "121212"; 상수는 변경 불가능.
        System.out.printf("ssn: %s, name:%s\n",
                k1.nation, k1.ssn,k1.name);

    }
}
//기본패키지는 적어도 점(..)2개가 있어야 된다.

