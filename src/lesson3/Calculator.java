package lesson3;

import java.util.Scanner;

public class Calculator {

    public static void printMenu() {
        System.out.println("Вы находитесь в главном меню");
        System.out.println("1. Посчитать сумму");
        System.out.println("2. Посчитать разность");
        System.out.println("3. Посчитать произведение");
        System.out.println("4. Посчитать корень из числа");
        System.out.println("0. Выход");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        double z;
        printMenu();
        while (true) {
            System.out.println("Введите номер команды");
            int command = in.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Введите два числа");
                    x = in.nextInt();
                    y = in.nextInt();
                    System.out.println("Сумма двух чисел: " + (x + y));
                    break;
                case 2:
                    System.out.println("Введите два числа");
                    x = in.nextInt();
                    y = in.nextInt();
                    System.out.println("Разность двух чисел: " + (x - y));
                    break;
                case 3:
                    System.out.println("Введите два числа");
                    x = in.nextInt();
                    y = in.nextInt();
                    System.out.println("Произведение двух чисел: " + (x * y));
                    break;
                case 4:
                    System.out.println("Введите одно число");
                    z = in.nextDouble();
                    System.out.println("Корень квадратный из числа: " + Math.sqrt(z));
                    break;
                case 0:
                    System.out.println("Программа завершена");
                    return;
                default:
                    System.out.println("Вы ввели неверную команду");
            }
        }
    }
}
