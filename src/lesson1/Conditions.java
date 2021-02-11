package lesson1;

import java.util.Scanner;

public class Conditions {
    // управляющие конструкции
    // if, switch
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        // ax^2+bx+c
        if (x > 100) {
            System.out.println("More than 100");
        } else if (x > 10) {
            System.out.println("More than 10");
        } else if (x > 0){
            System.out.println("x is digit");
        } else {
            System.out.println("x is negative value");
        }

        boolean left = true;
        boolean right = false;
        System.out.println(left && right);
        System.out.println(left && left);
        System.out.println(left || right);
    }
}
