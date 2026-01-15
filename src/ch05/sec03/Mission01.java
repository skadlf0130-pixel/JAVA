package ch05.sec03;

public class Mission01 {
    public static void main(String[] args){
        String filmNm = "abc12-jjk-.bbb.kkk.zip";
        //유연하게 코드 작성
        //확장자명출력
        int i = filmNm.lastIndexOf(".");
        String j = filmNm.substring(i+1);
        System.out.println("filmNm : "+ filmNm );
        System.out.println("j : "+ j );
    }
}
