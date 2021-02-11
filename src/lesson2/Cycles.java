package lesson2;

public class Cycles {

    public static void main(String[] args) {
//        while (true) {
//            System.out.println(1);
//            System.out.println(2);
//            System.out.println(3);
//        }
        int n = 1;
        while (n < 10) {
            System.out.print(n + " ");
            n++; // n = n + 1
        }
        System.out.println();
        while (n > 1) {
            n--;
            System.out.print(n + " ");
        }
        System.out.println();
        int cnt = 0;
        while (cnt < 32) {
            System.out.print((n - 1) + " ");
            n *= 2;
            cnt++;
        }
        System.out.println();

        int x = 8467;
        // log2(x) -> 2 ** k <= 7262
        cnt = 0;
        while (x > 1) {
            x /= 2;
            cnt++;
        }
        System.out.println(cnt);

        int i = 1, j = 1;
        while (i < 10) {
            while (j < 10) {
                System.out.printf("%3d", i * j); // d - int, long; f - float, double; c - char; s - String
                j++;
            }
            j = 1;
            System.out.println();
            i++;
        }
    }
}
