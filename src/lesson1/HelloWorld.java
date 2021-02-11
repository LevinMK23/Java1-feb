package lesson1;

public class HelloWorld {

    // psvm
    public static void main(String[] args) {
        // sout
        System.out.println("Hello world");
        // Типы данных
        byte byteVar = -128; // 1b = 8bit 2 ** 8 / 2
        short shortVar = -32768;
        int intVar = (int) 2e9;
        long longVar = (long) 1e18;

        float floatVar = 123.44554f;
        double doubleVar = 1.5d;

        char symbol = 'a'; // ' \
        // \ "

        boolean boolVar = true;

        System.out.println(1/3d);
        System.out.println(1/3f);
        System.out.printf("%.20f\n%.20f\n", 1/3d, 1/3f);

        long a = (short) 12 + (byte) 34;
        int b = (short) 12 + (byte) 34;
        int c = (byte) 1257568;

        System.out.println(c);

        // 120
        int x = 100, y = 15;
        System.out.println("****************");
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println((double) x / y);
        System.out.println(x % y);

        // побитовые операции (почитать в интернете)
        x = x << 1;
        x = x >> 2;
        x = x | y;


    }

}
