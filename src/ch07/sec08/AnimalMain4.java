package ch07.sec08;

public class AnimalMain4 {
    public static void main(String[] args){
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();
        Cat cat = new Cat();

        doCrying(dog);
        doCrying(cat);
        doCrying(bullDog);

    }
    public static void doCrying(Animal animal) {
        animal.crying();
    }
}
