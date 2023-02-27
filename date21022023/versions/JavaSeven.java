package date21022023.versions;

import java.sql.SQLException;

public class JavaSeven
{
    // Compressed 64-bit pointers
    // Upgraded classloader architecture
    // Multiple exception handling
    public static void main(String[] args)
    {
        try{
            throw new SQLException("Throwing exception");
        }catch(SQLException e){
            System.out.println(1);
            System.out.println(e);
        }catch(Exception e){
            System.out.println(2);
            System.out.println(e);
        }
        finally
        {
            System.out.println("Exception thrown");
        }
    }
}
