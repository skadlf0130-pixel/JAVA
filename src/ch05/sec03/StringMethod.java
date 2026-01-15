package ch05.sec03;

public class StringMethod {
    public static void main(String[] args){
        //문자열 부분 변경
        String oldStr = "자바 프로그래밍";
        String newStr = oldStr.replace("자바","Java");

        System.out.println("oldStr: "+oldStr);
        System.out.println("newStr: "+newStr);
        //원본 oldStr을 훼손하지 않는다.

        String oldStr2 = "가나다12라마바33사ABCD4";
        String newStr2 = oldStr2.replaceAll("\\d","");
        String newStr3 = oldStr2.replaceAll("[가-힣a-zA-Z]","");
        System.out.println("oldStr2: "+oldStr2);
        System.out.println("newStr2: "+newStr2);
        System.out.println("newStr3: "+newStr3);

        String oldStr4 = "안녕 하 세요. 반가워요. 저는 홍 길동 입니다.";
        String newStr4 = oldStr4.replaceAll(" ","");
        System.out.println(newStr4);
        //빈칸도 문자열이다. 문자열은 replaceAll이나 replace 둘다가능.
        // 빈칸, . , , 를 지우고 싶다.
        String newStr4_1 = oldStr4.replace(" ","")
                                  .replace(".","")
                                  .replace(",",""); //체이닝기법
        String newStr4_2 = oldStr4.replaceAll("[ .,]","");

        System.out.println(newStr4_1);
        System.out.println(newStr4_2);

    }
}
