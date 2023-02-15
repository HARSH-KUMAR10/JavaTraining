package Date15022023.ExceptionAdvanced;

import java.io.FileWriter;
import java.io.IOException;

class StringLengthOutOfBound2 extends IOException{
    StringLengthOutOfBound2(String s){
        super(s);
    }
}

class WriteStringToFile2{
    FileWriter fw = null;
    boolean writeStringToFile2(String s){
        try {
            fw = new FileWriter("test2.txt");
            if(s.length()>10){
                throw new StringLengthOutOfBound2("String length is greater than or equal to 10.");
            }else{
                fw.write(s);
                return true;
            }
        }catch(IOException e){
            System.out.println(e);
        }
        // Already catch by IOException above
//        catch(StringLengthOutOfBound2 sloob){
//            System.out.println(sloob);
//        }
        return false;
    }
}

class WriteStringToFileWithThrows2{
    FileWriter fw = null;
    boolean writeStringToFileWithThrows2(String s) throws StringLengthOutOfBound2{
        try {
            fw = new FileWriter("test2.txt");
            if(s.length()>10){
                throw new StringLengthOutOfBound2("String length is greater than or equal to 10.");
            }else{
                fw.write(s);
                return true;
            }
        }catch(IOException e){
            System.out.println("inside WriteStringToFileWithThrows2 catch : "+e);
            return false;
        }
    }
}

public class CustomCheckedExceptionFixStringLenForFile {
    public static void main(String[] args) {

        WriteStringToFile2 wfts2 = new WriteStringToFile2();
        System.out.println("Writing first : "+wfts2.writeStringToFile2("Harsh"));
        WriteStringToFileWithThrows2 wftswt2 = new WriteStringToFileWithThrows2();
        try {
            System.out.println("inside try : "+wftswt2.writeStringToFileWithThrows2("Harsh Kumar"));
        }catch (StringLengthOutOfBound2 sloob){
            System.out.println("inside main catch : "+sloob);
        }
        WriteStringToFileWithThrows2 wftswt4 = new WriteStringToFileWithThrows2();
//        System.out.println(wftswt4.writeStringToFileWithThrows2("Check This String"));
        // Will not work without try-catch block.
    }
}
