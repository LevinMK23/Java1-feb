package lesson6;

public class StaticTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Bobby");
        //System.out.println(Cat.cnt);
        Cat cat1 = new Cat("Bobby1");
        //System.out.println(Cat.cnt);
        Cat cat2 = new Cat("Bobby2");
        System.out.println(Cat.cnt);
        // Cat.foo();
        System.out.println(cat.getId());
        System.out.println(cat1.getId());
        System.out.println(cat2.getId());
    }
}
