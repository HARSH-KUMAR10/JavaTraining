package date20022023;

class TestException extends Exception
{
}

public class ExceptionSequenceExample
{
    public static void m1() throws Exception
    {
        System.out.print("A");
        throw new TestException();
    }

    public static void main(String[] args)
    {
        try
        {
            m1();
        }
        catch (TestException e)
        {
            System.out.println("B");
        }catch(Exception e){
            System.out.println(e);
        }
        finally
        {
            System.out.println("C");
        }
    }
}
