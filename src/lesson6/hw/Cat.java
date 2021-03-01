package lesson6.hw;

public class Cat extends Animal {

    private final int runLimit;

    public Cat(String name) {
        super(name);
        runLimit = (int) (100 + Math.random() * 1000);
    }

    @Override
    public void swim(int distance) {
        // throw new RuntimeException("Cat cannot swim!");
        System.out.println("Я не умею плавать");
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println("Кот " + getName() + " пробежал " + distance + " метров");
        } else {
            System.out.println("Кот " + getName() + " не может пробежать так много");
        }
    }
}
