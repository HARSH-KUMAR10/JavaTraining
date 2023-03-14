package date13032023.threading;

public class DaemonThreadsExample extends Thread
{
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
        System.out.println((Thread.currentThread().isDaemon() ? "Daemon" : "Normal") + " Thread");
    }

    public static void main(String[] args)
    {
        try
        {

            DaemonThreadsExample thread1 = new DaemonThreadsExample();

            DaemonThreadsExample thread2 = new DaemonThreadsExample();

            DaemonThreadsExample thread3 = new DaemonThreadsExample();

            thread1.setDaemon(true);

            thread1.start();

            thread2.start();

            thread3.start();

            System.out.println("Thread1 state: " + thread1.getState());

            System.out.println("Thread2 state: " + thread2.getState());

            System.out.println("Thread3 state: " + thread3.getState());

            System.out.println("Thread count: " + Thread.activeCount());
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
