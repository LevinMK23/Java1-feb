package lesson2;

import static java.lang.Math.max;
import static java.lang.Math.random;

public class ArrayExample {

    public static void main(String[] args) {
        if (args != null && args.length == 2) {
            System.out.println("Args sum = " +
                    (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
        }
        String s = "Hello\\'";
        String s1 = "Mike\"";
        s = s + " " + s1;
        System.out.println(s);
        System.out.println(" " + (1 + 2) + " " + 3 + " ");
        String tab = "\t";
        String enter = "\n\r";
        System.out.println(tab + "1");
        System.out.println("2" + enter + 2);

        int[] a = new int[10];
        // a.length
        // (int) (random() * 100); // (0, 1)
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (random() * 100);
        }
        // for each
        int sum = 0;
        for (int i : a) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("sum = " + sum);
        int maxLength = 1, length = 1;
        a = new int[]{1, 2, 1, 2, 1, 2, 3, 1, 2};
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] > a[i]) {
                length++;
            } else {
                maxLength = max(maxLength, length);
                length = 1;
            }
        }
        maxLength = max(maxLength, length);
        System.out.println(maxLength);
        length = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] > a[i]) {
                length++;
                if (length == maxLength) {
                    // i + 1 - length
                    for (int j = i - length + 2; j <= i + 1; j++) {
                        System.out.print(a[j] + " ");
                    }
                    System.out.println();
                    // break;
                }
            } else {
                length = 1;
            }
        }
    }
}
