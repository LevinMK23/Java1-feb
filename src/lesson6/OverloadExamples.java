package lesson6;

public class OverloadExamples {

    static int foo(int a, int b) {
        return a + b;
    }

    static int foo(int a) {
        return a * a;
    }

    static int foo(float a, float b) {
        return (int) (a * b);
    }

    public static void main(String[] args) {
        System.out.println(foo(5));
    }
}
