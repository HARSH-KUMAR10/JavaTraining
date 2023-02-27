package date17022023.methodExecutionSequence;

public class ExceptionWithoutCatch
{
    public void show()
    {
        try
        {
            int x = 10 / 0;
        }
        finally
        {
            System.out.println("Show");
        }
    }

    public static void main(String[] args)
    {
        ExceptionWithoutCatch excceptionWithoutCatch = new ExceptionWithoutCatch();
        excceptionWithoutCatch.show();
    }
}
