package lesson6.hw;

public class Test {
    public static void main(String[] args) {

        Cat cat = new Cat("Васька");
        Dog dog = new Dog("Бобик");

        cat.run(50);
        cat.swim(123);
        dog.swim(200);
        dog.run(1000);

        System.out.println(Animal.getAnimalCount());
    }
}
