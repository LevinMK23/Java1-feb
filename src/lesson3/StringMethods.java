package lesson3;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {
        String s = "89112756975";
        String s1 = "mike@yandex.ru";
        System.out.println(s.matches("[0-9]{11}"));
        System.out.println(s1.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z0-9._-]+"));
        String lower = "mike";
        System.out.println(lower.toUpperCase());
        lower = "     214      \n\r";
        System.out.println(lower.trim());
        s = "aaa1b2bb4c5c5cd5d9d";
        System.out.println(s.replaceAll("[0-9]+", ""));
    }
}
