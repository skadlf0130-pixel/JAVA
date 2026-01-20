package ch07.sec08;

public class AnimalMain3 {
    public static void main(String[] args){
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();
        Cat cat = new Cat();

        doCrying(dog);
        doCrying(cat);
        doCrying(bullDog);

    }
    public static void doCrying(Cat cat) {
        cat.crying();
    }
    public static void doCrying(Dog dog) {
        dog.crying();
    }
    public static void doCrying(BullDog bullDog){
        bullDog.crying();
    }

}
