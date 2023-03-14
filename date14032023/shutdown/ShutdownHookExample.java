package date14032023.shutdown;

public class ShutdownHookExample
{
    public static void main(String[] args)
    {
        try
        {
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("System shutting down");
            }));
            System.out.println("Program started:");
            Thread thread = new Thread(() -> {
                System.out.println("Running thread ...");
                try
                {
                    Thread.sleep(2000);
                }
                catch (Exception exception)
                {
                    System.out.println(exception);
                }
                System.out.println("Thread completed ...");
            });
            System.out.println("Starting thread ...");
            thread.start();
            thread.join();
            System.out.println("Program completed");
        }catch(Exception exception){
            System.out.println(exception);
        }
    }
}
