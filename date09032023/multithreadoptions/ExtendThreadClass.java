package date09032023.multithreadoptions;

public class ExtendThreadClass extends Thread
{
    public void run()
    {
        System.out.println("Thread started");
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException interruptedException)
        {
            System.out.println(interruptedException);
        }
        System.out.println("Thread ended");
    }

    public static void main(String[] args)
    {
        try
        {
            System.out.println("Main started");

            ExtendThreadClass extendThreadClass = new ExtendThreadClass();

            extendThreadClass.start();

            System.out.println("Main ended");
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
