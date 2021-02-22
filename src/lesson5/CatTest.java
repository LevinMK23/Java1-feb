package lesson5;

public class CatTest {
    public static void main(String[] args) {
        Cat vaska = new Cat("Vaska", 5);
        System.out.println(vaska);
        System.out.println(vaska.getName());
        System.out.println(vaska.getAge());
        Cat murzik = new Cat("Murzik", 3);
        // murzik.fightWith(vaska, true);
        Cat petr = murzik;
        petr.setName("Petr");
        System.out.println(murzik.getName());
    }
}
