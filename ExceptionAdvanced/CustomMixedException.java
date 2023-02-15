package Date15022023.ExceptionAdvanced;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CustomMixedException {
    static {
        try {
            FileWriter fw = new FileWriter("test2.txt");
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        System.out.println("checking static block");
    }
}
