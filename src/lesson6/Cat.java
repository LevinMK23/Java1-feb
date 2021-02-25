package lesson6;

public class Cat extends Animal {

    public static int cnt = 0;

    private final int id;

    public Cat(String name) {
        super(name);
        cnt++;
        id = cnt;
    }

    public static void foo() {
        System.out.println("MEOW");
    }

    public int getId() {
        return id;
    }

    @Override
    public void say() {
        System.out.println("MEOW");
    }

}
