package lesson7;

public class StringExample {

    public static void testString() {
        long start = System.currentTimeMillis();
        String s = "a";
        for (int i = 0; i < 200000; i++) {
            s += "a"; // O(N), N - длина строки
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start) + " ms.");
    }

    public static void testStringBuilder() {
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder("a");

        for (int i = 0; i < 200000; i++) {
            s.append("a"); // O(1)
        }

        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start) + " ms.");
    }

    public static void main(String[] args) {
//        String s1 = "123";
//        String s2 = new String("123");
//        String s3 = "123";
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s2.intern());
//        s1 = s2 + s3;
//        // 123, 123, 123123
//        System.out.println(s1);
        testString();
        testStringBuilder();
    }

}
