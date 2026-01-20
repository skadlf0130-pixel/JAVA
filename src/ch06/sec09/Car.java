package ch06.sec09;

public class Car {
    String model;
    int speed;

//전역변수(속성이나 메소드)를 지칭하고 싶으면 꼭 this.을 붙여주면 좋다.
//this.은 생략가능하나 이름이 같을땐 붙여준다.
    public Car(String model){
        this.model = model;
        this.introduce();
    }
    public Car(){
        this("소나타");

    }


    public void introduce(){
        System.out.printf("모델명:%s\n", this.model);
    }
}
