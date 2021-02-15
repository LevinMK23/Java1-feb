package lesson2.homework;

import java.util.Arrays;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Решение домашего задания урок 2
 * @author mikelevin
 * */
public class HomeWork {

    public static void inverse(int[] array) {
        // 0 0 1 1
        // 1 1 0 0
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] + 1) % 2;
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
            matrix[i][n - i - 1] = 1;
        }
        return matrix;
    }

    public static void printMinMax(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i : array) {
            max = max(i, max);
            min = min(i, min);
        }
        System.out.println(min + " " + max);
    }

    // cmd + option + l
    // ctrl + alt + l
    public static boolean isBalanced(int[] array) {
        int pos = -1;
        int leftSum = 0;
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        if (sum % 2 != 0) {
            System.out.println("Not balanced");
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            if (leftSum * 2 == sum) {
                pos = i;
            }
        }
        if (pos != -1) {
            pos++;
            for (int i = 0; i < array.length; i++) {
                if (i == pos) {
                    System.out.print("| ");
                }
                System.out.print(array[i] + " ");
            }
            System.out.println();
            return true;
        }
        System.out.println("Not balanced");
        return false;
    }

    /**
     * Метод, осуществляющий циклический сдвиг в массиве
     * @param array массив для циклического сдвига
     * @param n на сколько позиций осуществляется сдвиг
     * */
    public static void shift(int[] array, int n) {
        n = n % array.length;
        // len = 5, n = -3 (5 - 3) % 5 = 2
        n = (array.length + n) % array.length;
        for (int j = 0; j < n; j++) {
            int tmp = array[0];
            // 1 2 3
            // 2 3
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] a = new int[]{0, 0, 1, 1}; // 1 1 0 0
        inverse(a);
        System.out.println(Arrays.toString(a));
        // cmd + option + v
        int[][] matrix = generateMatrix(5);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        printMinMax(new int[]{1, 3, 7, 2, 0, 5, 9, 17, 1, 1});
        System.out.println(isBalanced(new int[]{1, 2, 1, 3, 4, 2, 1, 8, 10, 2, 2, 8}));
        System.out.println(isBalanced(new int[]{1, 2, 3, 4, 2, 1}));

        System.out.println(-12 % 7);
        System.out.println(-3 % 2);
        shift(new int[]{1, 2, 3, 4, 5}, 3);
        shift(new int[]{1, 2, 3, 4, 5}, -1);
        shift(new int[]{1, 2, 3, 4, 5}, 1);
        for (int i = 1; i <= 5; i++) {
            shift(new int[]{1, 2, 3, 4, 5}, i);
        }
    }

}
