package Date15022023.ExceptionAdvanced;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Throws3 {
    static void Exec() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("Sending Array Index Out Of Bound");
    }
    static void Exec1() throws ArithmeticException {
        throw new ArithmeticException("Sending Arithmetic Exception");
    }
    static void Exec2() throws SQLException {
        throw new SQLException("Sending SQL Exception");
    }
    static void Exec3() throws IOException {
        throw new IOException("Sending IO Excepition");
    }

    public static void main(String[] args) {
        Exec();
        Exec1();
        try {
            Exec2();
        }catch(SQLException s){
            System.out.println(s);
        }
        try {
            Exec3();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
