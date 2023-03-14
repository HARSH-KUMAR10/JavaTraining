package date09032023.multithreadingmethods;

public class SingleThreadedEnvironment
{
    static void print(String threadCallCount, long waitingTime) throws InterruptedException
    {
        Thread.sleep(waitingTime);

        System.out.println(Thread.currentThread().getName()+" == "+threadCallCount);

        System.out.println("Current active thread count: "+Thread.activeCount());
    }

    public static void main(String[] args)
    {
        try
        {
            long startTime = System.currentTimeMillis();

            System.out.println("Starting Execution");

            print("Thread-3", 4500);

            print("Thread-2", 3500);

            print("Thread-1", 2500);

            print("Thread-0", 1500);

            System.out.println("Execution ends\nTotal time:"+(System.currentTimeMillis()-startTime));
        }
        catch (InterruptedException interruptedException)
        {
            System.out.println("Error occurred while printing: " + interruptedException);
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
