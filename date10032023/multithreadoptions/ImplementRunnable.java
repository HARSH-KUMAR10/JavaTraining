package date10032023.multithreadoptions;

public class ImplementRunnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Run method started");
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException interruptedException)
        {
            System.out.println();
        }
        System.out.println("Run method ended");
    }

    public static void main(String[] args)
    {
        System.out.println("Main started");

        System.out.println("Thread count: " + Thread.activeCount());

        ImplementRunnable implementRunnable = new ImplementRunnable();

        System.out.println("Runnable implemented class object created, Thread count: " + Thread.activeCount());

        Thread thread = new Thread(implementRunnable);

        System.out.println("Thread object created using runnable interface, Thread count: " + Thread.activeCount());

        thread.start();

        System.out.println("Thread start method called, Thread count: " + Thread.activeCount());

        System.out.println("Main ended");

        Runnable runnable = new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(5000);
                }
                catch (InterruptedException interruptedException)
                {
                    System.out.println(interruptedException);
                }
                System.out.println("Run method called");
            }
        };

        Thread thread1 = new Thread(runnable);

        thread1.start();
    }
}
