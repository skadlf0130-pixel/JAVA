package ch06.sec09;

public class TruckMain {
    public static void main(String[] args){
        Truck t1 = new Truck();
        t1.company = "타타대우";
        t1.model = "5톤";
        t1.introduce();

        Truck t2 = new Truck();
        t2.company = "르노";
        t2.model = "10톤";
        t2.introduce();

        //static을 사용할 때는 '클래스명.' 으로 사용.
        Truck.company = "현대";

        t1.introduce();
        t2.introduce();

        Truck.run(); //run은 static메소드
        Math.random();

        System.out.println(); //outd은 static 멤버필드
    }
}
