package Date15022023.ExceptionAdvanced;

import java.io.IOException;
import java.sql.SQLException;

public class Throws2 {
    static void Exec() throws ArrayIndexOutOfBoundsException {
        System.out.println("Sending Array Index Out Of Bound Exception");
    }
    static void Exec1() throws ArithmeticException {
        System.out.println("Sending Arithmetic Exception");
    }
    static void Exec2() throws SQLException{
        System.out.println("Sending SQL Exception");
    }
    static void Exec3() throws IOException{
        System.out.println("Sending IO Excepition");
    }

    public static void main(String[] args) {
        Exec();
        Exec1();
        try {
            System.out.println("--------------try-catch----------------");
            Exec2();
        }catch (SQLException s){
            System.out.println(s);
        }
        try{
            System.out.println("--------------try-catch-----------------");
            Exec3();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
