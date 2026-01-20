package ch06.sec09;

public class Truck {
    /*
    static은 객체생성과는 무관. 공간이 무조건 하나!!
    static이 붙으면 '클래스명.' 으로 사용.
    객체 생성을 하지 않아도 이미 공간 할당이 되어 사용이 가능.


     */

    static  String company;
    String model;

    // static이 붙지않는 여기서
    void introduce(){
        System.out.printf("company: %s, model:%s\n",
                company, model);

        //메모리에 등록이 되어 있어 밑에 내용을 불러올수는 있다.

        run();
    }
    //여기까진 설계도에 불과.

    static void run(){
    // 만약 static이 안붙인 내용을 사용하고 싶다면 객체화부터 해서 사용.
    //새로 객체를 생성을 해준다.
    //설계도와는 다른 내용
    //객화없이도 메모리 사용가능.
        Truck t = new Truck();
        t.model = "15톤";
        System.out.printf("%s 회사의 차량이 달린다.\n", company);
    }
}
