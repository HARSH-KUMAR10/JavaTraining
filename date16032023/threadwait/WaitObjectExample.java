package date16032023.threadwait;

public class WaitObjectExample
{
    public static void main(String[] args)
    {
        Integer i = new Integer(20);
        try
        {
            i.wait();
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
