package date09032023.multithreadoptions;

public class ExtendThreadClass2 extends Thread
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Main started");

            ExtendThreadClass2 extendThreadClass2 = new ExtendThreadClass2();

            System.out.println("Thread created not started, Thread count: " + Thread.activeCount());

            extendThreadClass2.start();

            System.out.println("Thread started, Thread count: " + Thread.activeCount());

            System.out.println("Thread count: " + Thread.activeCount());

            System.out.println("Main ended");
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
