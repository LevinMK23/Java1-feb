package lesson4;

import java.util.Scanner;

public class GameXO {

    private static final char X = 'X';
    private static final char O = '0';
    private static final char DEFAULT = '_';
    private static final char DELIMITER = '|';

    private static int steps = 0;

    private static char[][] MAP = new char[3][3];

    // |X|_|_|
    // |_|0|_|
    // |_|_|X|

    private static void fillMap() {
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                MAP[i][j] = DEFAULT;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                System.out.print(DELIMITER + "" + MAP[i][j]);
            }
            System.out.println(DELIMITER);
        }
    }

    private static void game() {
        steps = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Делайте ваш ход:");
            int x = in.nextInt(), y = in.nextInt();
            // option + enter
            // alt + enter
            x--;
            y--;
            if (validInput(x, y)) {
                MAP[x][y] = X;
                steps++;
                if (isWin(X)) {
                    System.out.println("Вы победили!");
                    return;
                }
                if (steps == MAP.length * MAP.length) {
                    System.out.println("Ничья!");
                    return;
                }
                movePC();
                if (isWin(O)) {
                    System.out.println("Вы проиграли!");
                    return;
                }
            } else {
                System.out.println("Неверный ход! Будте повнимательней");
            }
            printMap();
        }
    }

    private static void movePC() {
        // * TODO: 18.02.2021 блокировать ходы пользователя
        int x, y;
        do {
            x = (int) (Math.random() * MAP.length);
            y = (int) (Math.random() * MAP.length);
        } while (!validInput(x, y));
        MAP[x][y] = O;
        steps++;
    }

    private static boolean isWin(char x) {
        for (int i = 0; i < MAP.length; i++) {
            // accumulate
            boolean h = true, v = true, d1 = true, d2 = true;
            int ch = 0, cv = 0, cd1 = 0, cd2 = 0;
            for (int j = 0; j < MAP.length; j++) {
                h &= MAP[i][j] == x;
                v &= MAP[j][i] == x;
                d1 &= MAP[j][j] == x;
                d2 &= MAP[j][MAP.length-j-1] == x;
            }
            if (h || v || d1 || d2) {
                return true;
            }
        }
        return false;
    }

    private static boolean validInput(int x, int y) {
        boolean inMap = x >= 0 && y >= 0 && x < MAP.length && y < MAP.length;
        return inMap && MAP[x][y] == DEFAULT;
    }

    // end point
    public static void main(String[] args) {
        System.out.println("Вы в игре 'Крестики Нолики'");
        System.out.println("На каждом ходу вы вводите два числа: номер строки и номер столбца");
        fillMap();
        printMap();
        game();
    }

}
