package date17022023.methodExecutionSequence;

public class TryStatementCatch
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("try");
        }
//        System.out.println("After try");
//        after try either catch or finally block allowed
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
