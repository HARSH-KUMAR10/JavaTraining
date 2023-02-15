package Date15022023.ExceptionAdvanced;

import java.io.FileWriter;
import java.io.IOException;

// Interface can't extend Class
//class A{
//
//}
//interface B extends A{}

class WriteFile{
    String safeWrite(String s, boolean append) throws IOException {
        FileWriter fw = new FileWriter("test.txt",append);
        fw.write(s);
        fw.close();
        return s+" has been written to file";
    }
    String write(String s,boolean append){
        try {
            FileWriter fw = new FileWriter("test.txt",append);
            fw.write(s);
            fw.close();
        }catch(IOException e){
            System.out.println(e);
        }
        return s+" has been written to file";
    }
}

public class ThrowsChecked {
    public static void main(String[] args) {
        WriteFile wf = new WriteFile();
        wf.write("This throws handled exception\n",false);
        try {
            wf.safeWrite("This throws unhandled exception\n",true);
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("File Written");
    }
}
