package StreamsExample;

import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("test1.txt");
            
        }catch (Exception e){System.out.println(e);}
    }
}
