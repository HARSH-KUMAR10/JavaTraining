package Date15022023.ExceptionAdvanced;

import java.io.FileWriter;
import java.io.IOException;

class StringLengthOutOfBound extends RuntimeException{
    StringLengthOutOfBound(String s){
        super(s);
    }
}

class WriteStringToFile{
    FileWriter fw = null;
    boolean writeStringToFile(String s){
        try {
            fw = new FileWriter("test2.txt");
            if(s.length()>10){
                throw new StringLengthOutOfBound("String length is greater than or equal to 10.");
            }else{
                fw.write(s);
                return true;
            }
        }catch(IOException e){
            System.out.println(e);
        }
        catch(StringLengthOutOfBound sloob){
            System.out.println(sloob);
        }
        return false;
    }
}

class WriteStringToFileWithThrows{
    FileWriter fw = null;
    boolean writeStringToFileWithThrows(String s) throws StringLengthOutOfBound{
        try {
            fw = new FileWriter("test2.txt");
            if(s.length()>10){
                throw new StringLengthOutOfBound("String length is greater than or equal to 10.");
            }else{
                fw.write(s);
                return true;
            }
        }catch(IOException e){
            System.out.println(e);
        }
        return false;
    }
}

public class CustomExceptionToFixStringInputToFile {
    public static void main(String[] args) {
        WriteStringToFile wfts = new WriteStringToFile();
        System.out.println(wfts.writeStringToFile("Harsh"));
        WriteStringToFileWithThrows wftswt = new WriteStringToFileWithThrows();
        try {
            System.out.println(wftswt.writeStringToFileWithThrows("Harsh Kumar"));
        }catch (StringLengthOutOfBound sloob){
            System.out.println(sloob);
        }
        WriteStringToFileWithThrows wftswt2 = new WriteStringToFileWithThrows();
        System.out.println(wftswt2.writeStringToFileWithThrows("Check This String"));
    }
}
