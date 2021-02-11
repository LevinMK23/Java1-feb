package lesson2;

public class BreakExample {

    public static void main(String[] args) {
        label:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j + k > 2) {
                        continue label;
                    }
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }

        int a = 3;
        {
            int b = 4;
            {
                int c = 5;
                System.out.println(c);
            }

            System.out.println(b);
        }
    }
}
