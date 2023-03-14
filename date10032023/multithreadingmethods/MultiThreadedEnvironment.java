package date10032023.multithreadingmethods;

public class MultiThreadedEnvironment
{

    public static void main(String[] args)
    {
        try
        {
            long startTime = System.currentTimeMillis();

            System.out.println("Starting Execution");

            Thread thread1 = new Thread(() -> {
                try
                {
                    SingleThreadedEnvironment.print("Thread-0", 1500);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            });
            Thread thread2 = new Thread(() -> {
                try
                {
                    SingleThreadedEnvironment.print("Thread-1", 2500);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            });
            Thread thread3 = new Thread(() -> {
                try
                {
                    SingleThreadedEnvironment.print("Thread-2", 3500);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            });
            Thread thread4 = new Thread(() -> {
                try
                {
                    SingleThreadedEnvironment.print("Thread-3", 4500);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            });
            thread4.start();

            thread3.start();

            thread2.start();

            thread1.start();
            while(true){
                if(!thread1.isAlive() && !thread2.isAlive() && !thread3.isAlive() && !thread4.isAlive()){

                    System.out.println("Execution ends\nTotal time:"+(System.currentTimeMillis()-startTime));

                    System.out.println("Current active thread count: "+Thread.activeCount());

                    break;
                }
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }

    }
}
