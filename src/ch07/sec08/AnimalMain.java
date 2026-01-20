package ch07.sec08;

public class AnimalMain {
/*
대전제 3가지
1. 부모타입의 변수는 자식 객체 주소값 담을 수 있다.
2. 자식타입의 변수는 부모 객체 주소값 담을 수 없다.
3. 메소드 호출은 타입이 알고 있는 메소드만 호출할 수 있고,
    호출이 되면 객체 기준에서 메소드를 찾는다.

    래퍼런스 타입끼리의 형변환은 상속관계에서만 가능.
    다형성은 상속관계에서만 나타난다.
 */

    public static void main(String[] args){
        //1번 내용
        // Animal 객체 주소값 담을 수 있는
        // animal변수+ Animal자식 객체의 주소값도 가능.
        Animal animal = new Dog();
        //Dog 타입의 변수로 BullDog객체 주소갑 담을수 있나? ->가능.
        Dog dog = new BullDog();
        dog.crying();

        //2번 내용
        // Dog dog2 = new Animal(); 컴파일 에러뜬다
        //위에는 실제로 dog객체가 담겨져 있지만 자동으로 형변환이 되지 안아 강제 형변환 해줘야한다
        // Dog dog2 =(Dog)(new Animal()); 부모객체를 자식객체로 강제 형변환 해도 안된다. 2번 위반.

        //animal 변수에는 Dog객체 주소값이 담겨져 있기 때문에 Dog타입
        //변수에 주소값 담을 수 있다.
        Dog dog3 = (Dog)animal;
        Dog dog4 = new Dog();


        // 3번내용.
        animal.crying();

        System.out.println("끝");
    }
}
