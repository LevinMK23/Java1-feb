package lesson6;

public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("MOO");
    }
}
