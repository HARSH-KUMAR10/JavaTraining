package date13032023.threading;

public class RunMethodExample extends Thread
{

    public void run()
    {
        // If direct run method called no new threads are created - synchronous job
        try
        {
            Thread.sleep(1000);
            System.out.println("In run method");
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args)
    {
        try
        {
            RunMethodExample runMethodExample = new RunMethodExample();
            System.out.println("Before run method");
            runMethodExample.run();
            System.out.println("After run method");
            System.out.println("Before start method");
            runMethodExample.start();
            System.out.println("After start method");
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
