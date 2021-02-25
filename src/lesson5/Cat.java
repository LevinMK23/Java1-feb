package lesson5;

public class Cat {

    private String name;
    private int age;
    private int hp;
    private int strange;

    public Cat() {}

    // cmd + n
    // alt + insert

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.hp = 100;
        this.strange = (int) (5 + (Math.random() * 30));
    }

    public int getHp() {
        return hp;
    }

    public int getStrange() {
        return strange;
    }

    public int hit() {
        return 5 + (int) (Math.random() * 60);
    }

    public void fightWith(Cat otherCat, boolean mortalCombat) {
        if (mortalCombat) {
            while (true) {
                int dmg = otherCat.hit();
                hp -= dmg;
                System.out.println(otherCat.name + " hit me by " + dmg + " dmg");
                dmg = hit();
                otherCat.hp -= dmg;
                System.out.println("I'm hit " + otherCat.name + " by " +  dmg + " dmg");
                if (hp <= 0) {
                    System.out.println(otherCat.name + " kill me");
                    break;
                }
                if (otherCat.hp <= 0) {
                    System.out.println("I'm kill " + otherCat.name);
                    break;
                }
            }
        } else {
            hp -= otherCat.hit();
            System.out.println(otherCat.name + " hit me by " + otherCat.strange + " dmg");
            otherCat.hp -= hit();
            System.out.println("I'm hit " + otherCat.name  + " by " +  strange + " dmg");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    public void meow() {
        System.out.println("MEOW!");
    }
}
