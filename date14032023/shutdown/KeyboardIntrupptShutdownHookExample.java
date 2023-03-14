package date14032023.shutdown;

public class KeyboardIntrupptShutdownHookExample
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Program execution started ...");
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("Program execution completed ...");
            }));
            Thread thread = new Thread(() -> {
                System.out.println("Thread started ...");
                try
                {
                    System.out.println("Thread is stuck for 10 secs");
                    Thread.sleep(10000);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread completed ...");
            });
            thread.start();
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
