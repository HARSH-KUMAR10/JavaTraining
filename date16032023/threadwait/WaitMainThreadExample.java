package date16032023.threadwait;

public class WaitMainThreadExample
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().wait(1000);
        }
        catch (Exception exception)
        {
            System.out.println("Exception: "+exception);
        }
    }
}
