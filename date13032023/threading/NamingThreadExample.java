package date13032023.threading;

class NamingThread extends Thread
{
    NamingThread(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " running");
    }
}

class NamingRunnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " running");
    }
}

public class NamingThreadExample
{

    public static void main(String[] args)
    {
        try
        {
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " running");
            });

            System.out.println("Thread initial name: " + thread.getName());

            thread.setName("Harsh-0");

            System.out.println("Thread set name: " + thread.getName());

            thread.start();

            thread.join();

            System.out.println("=========================");

            NamingThread namingThread = new NamingThread("Harsh-Thread");

            System.out.println("Thread initial name: " + namingThread.getName());

            namingThread.setName("Harsh-Thread-0");

            System.out.println("Thread set name: " + namingThread.getName());

            namingThread.start();

            namingThread.join();

            System.out.println("=========================");

            NamingRunnable namingRunnable = new NamingRunnable();

            Thread thread1 = new Thread(namingRunnable, "Harsh-Runnable");

            System.out.println("Thread initial name: " + thread1.getName());

            thread1.setName("Harsh-Runnable-0");

            System.out.println("Thread set name: " + thread1.getName());

            thread1.start();

            thread1.join();

            System.out.println("=========================");

        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
