package lesson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileInput {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner in = new Scanner(file);
        //    fsgh sfh  sfhsfh sf hsf h h h hhhhhh
//        while (in.hasNext()) {
//            System.out.println(in.next());
//        }
        String line = in.nextLine();
        String[] strings = line.split(" +");
        System.out.println(Arrays.toString(strings));
//        System.out.println(in.nextLine());
//        System.out.println(in.nextLine());
//        System.out.println(in.nextLine());
    }
}
