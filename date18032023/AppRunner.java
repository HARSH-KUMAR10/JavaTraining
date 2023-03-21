package date18032023;

class ExecuteTaskUntilTimeout extends Thread
{
    Runnable task;

    long timeout;

    public ExecuteTaskUntilTimeout(Runnable task, long timeout)
    {
        this.task = task;
        this.timeout = timeout;
    }

    public void run()
    {
        long startTime = System.currentTimeMillis();
        Thread worker = new Thread(task, "worker");
        worker.start();
        while (true)
        {
            if (!worker.isAlive())
            {
                break;
            }
            if (System.currentTimeMillis() - startTime > timeout)
            {
                System.out.println("Execution timed out");
                worker.stop();
                break;
            }
        }
    }
}

public class AppRunner
{
    public static void main(String[] args)
    {
        new ExecuteTaskUntilTimeout(() -> {
            try
            {
                Thread.sleep(2000);

                System.out.println("MY TASK COMPLETED 1");
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }, 4000).start();

        new ExecuteTaskUntilTimeout(() -> {
            try
            {
                Thread.sleep(4000);

                System.out.println("MY TASK COMPLETED 2");
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }, 5000).start();
    }
}
