package lesson6;

import lesson6.chess.Figure;
import lesson6.chess.Rook;

public class AnimalTest {

    static void say(Animal animal) {
        animal.say();
    }

    public static void main(String[] args) {

        Animal cat = new Cat("Vasil");
        Animal dog = new Dog("Bobby");
        Animal cow = new Cow("Marta");

        say(new Cat("Oleg"));
        say(new Cow("Petr"));

        Figure rook = new Rook(1,1);

        Figure figure = new Figure(2, 2) {

            @Override
            public boolean canMoveTo(int x, int y) {
                return isInDesk(x, y);
            }
        };

        System.out.println(figure.getClass());
    }

}
