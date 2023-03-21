package date21032023.updatecodecache;

public class PrintingCodeCacheExample
{
    public static void main(String[] args)
    {
        try
        {
            Thread.sleep(20000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        System.out.println(HeavyOperations.performOperation());
        System.out.println(HeavyOperations.performOperation());
        try
        {
            Thread.sleep(20000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
