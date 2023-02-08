package StreamsExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args){
        try {
            FileOutputStream fos = new FileOutputStream("test1.txt");
            fos.write(65);
            String s1 = "hello world";
            byte[] b = s1.getBytes();
            fos.write(b);
            String s2 = "harsh, it a new ";
            byte[] b2 = s2.getBytes();
            fos.write(b2);
            fos.close();
            System.out.println("Written something");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
