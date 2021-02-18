package lesson3.hw;

import java.util.Scanner;

public class HW3 {

    private static final String[] words = {
            "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
            "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
            "pumpkin", "potato"
    };

    public static void wordGame() {

        int count = words.length;
        int randomIdx = (int) (Math.random() * count);
        String target = words[randomIdx];
        System.out.println("Вы в игре 'Угадай слово'");
        System.out.println("Вам предстоит угадать одно из " + count + " слов");
        System.out.println("Слова на английском языке из категории овощи и фрукты");

        Scanner in = new Scanner(System.in);
        // apple
        // ###############
        // alcoeol
        // a###e##########
        char[] guess = new char[15];
        for (int i = 0; i < 15; i++) {
            guess[i] = '#';
        }
        while (true) {

            System.out.println("Введите ваш вариант:");
            String word = in.next();
            if (word.equals(target)) {
                System.out.println("Вы отгадали слово, это: " + target);
                System.out.println("Игра закончена!");
                System.out.println("Начать новую игру: 1");
                System.out.println("Выход: любая клавиша");
                String command = in.next();
                if (command.equals("1")) {
                    wordGame();
                }

                return;
            }

            boolean anyEquals = false;
            int minLength = Math.min(word.length(), target.length());
            for (int i = 0; i < minLength; i++) {
                if (word.charAt(i) == target.charAt(i)) {
                    if (guess[i] == '#') {
                        anyEquals = true;
                    }
                    guess[i] = word.charAt(i);
                }
            }
            if (anyEquals) {
                System.out.println("Вы угадали несколько букв");
            }
            for (int i = 0; i < 15; i++) {
                System.out.print(guess[i]);
            }
            System.out.println();
            // word target
            // indexOutOfBounds
        }
    }

    public static void main(String[] args) {
        wordGame();
    }
}
