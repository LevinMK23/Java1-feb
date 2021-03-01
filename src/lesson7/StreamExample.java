package lesson7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamExample {

    public static void readDataBytes(String path) throws IOException {
        long start = System.currentTimeMillis();
        InputStream is = new FileInputStream(path);
        long cnt = 0;
        while (is.available() > 0) {
            int b = is.read();
            cnt++;
            if (cnt % 1000000 == 0) {
                System.out.println("Прочитано " + cnt + " байт");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start) + " ms.");
    }

    public static void readDataBytesBuffered(String path) throws IOException {
        long start = System.currentTimeMillis();
        InputStream is = new FileInputStream(path);
        long cnt = 0;
        byte[] buffer = new byte[8192]; // 8 Kb
        while (is.available() > 0) {
            int read = is.read(buffer);
            cnt += read;
            if (cnt % (8192 * 1000) == 0) {
                System.out.println("Прочитано " + cnt + " байт");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start) + " ms.");
    }

    public static void copy(String src, String dst) throws IOException {
        InputStream is = new FileInputStream(src);
        long cnt = 0;
        byte[] buffer = new byte[8192]; // 8 Kb
        OutputStream os = new FileOutputStream(dst);
        while (is.available() > 0) {
            int read = is.read(buffer);
            os.write(buffer, 0, read);
            cnt += read;
        }
        os.close();
        is.close();
    }

    public static void main(String[] args) throws IOException {
        readDataBytesBuffered("video.mp4");
        copy("graph.jpg", "copy.jpg");
    }
}
