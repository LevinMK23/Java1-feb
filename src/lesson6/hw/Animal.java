package lesson6.hw;

public abstract class Animal {

    private static int counter = 0;
    private String name;


    public Animal(String name) {
        counter++;
        this.name = name;
    }

    public abstract void swim(int distance);
    public abstract void run(int distance);

    public static int getAnimalCount() {
        return counter;
    }

    public String getName() {
        return name;
    }
}
