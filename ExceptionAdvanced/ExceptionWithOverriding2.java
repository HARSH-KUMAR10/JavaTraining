package Date15022023.ExceptionAdvanced;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

class Parent2{
    void msg() throws IOException{
        System.out.println("Parent1");
    }
    void msg1() throws SQLException{
        System.out.println("Parent2");
    }
    void msg2() {
        System.out.println("Parent3");
    }
    void msg3() throws ArrayIndexOutOfBoundsException{
        System.out.println("Parent4");
    }
}
public class ExceptionWithOverriding2 extends Parent2 {
    void msg() throws ArrayIndexOutOfBoundsException {
        System.out.println("Child");
//        throw new IOException("Child throws IO Exception"); have to handle checked exception separately to throw
//        thro new ArithmeticException("Child throw Arithmetic Exception");
    }
    void msg1(){
        System.out.println("Child");
//        throw new IOException("Child throws IO Exception"); have to handle checked exception separately to throw
        throw new ArithmeticException("Child throw Arithmetic Exception");
    }
    void msg2() throws ArrayIndexOutOfBoundsException{
        System.out.println("Child");
        throw new ArithmeticException("Child throws Arithmetic exception");
    }
    void msg3() throws ArithmeticException{
        System.out.println("Child");
        throw new ArithmeticException("Child throws Arithmetic exception");
    }

    public static void main(String[] args) {
        Parent2 p2 = new ExceptionWithOverriding2();
        p2.msg3();
        try {
            p2.msg();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
