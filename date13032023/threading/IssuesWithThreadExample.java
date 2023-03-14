package date13032023.threading;

public class IssuesWithThreadExample
{
    public static void main(String[] args)
    {
        Thread thread = new Thread(() -> {
            try
            {
                Thread.sleep(-100);
            }
            catch (Exception exception)
            {
                // Providing negative time in milli seconds
                System.out.println("=====sleep(-100)");
                System.out.println(exception.getMessage());
            }
            try
            {
                // Providing negative time in nano seconds
                System.out.println("=====sleep(100,-100)");
                Thread.sleep(100, -100);
            }
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }
        });
        try
        {
            thread.start();
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
        try
        {
            // Starting thread 2nd time
            thread.start();
        }
        catch (Exception exception)
        {
            System.out.println("======start() x 2");
            System.out.println(exception);
        }
    }
}
