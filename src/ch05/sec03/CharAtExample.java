package ch05.sec03;

public class CharAtExample {
    public static void main(String[] args){
        String ssn = "980624-4230123";
        int len= ssn.length();
        System.out.println("len: " + len);

        char gender = ssn.charAt(7);
        System.out.println("gender: "+gender);
        //1,3이면 2,4면 여자

        if(gender == '1' || gender =='3'){
            System.out.println("남자");
        } else if(gender == '2' || gender =='4'){
            System.out.println("여자");
        } else {
            System.out.println("다시 확인해 주세요.");
        }


    }
}
