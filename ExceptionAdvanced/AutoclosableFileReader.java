package Date15022023.ExceptionAdvanced;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AutoclosableFileReader {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("test.txt")){
            int c;
            while((c=fr.read())!=-1){
                System.out.print((char)c);
            }
            System.out.println("\nFile Read successful.");
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
