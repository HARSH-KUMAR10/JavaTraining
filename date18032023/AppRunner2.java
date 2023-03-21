package date18032023;

class ExecuteTaskUntilTimeout1 extends Thread
{
    Runnable task;

    long timeout;

    public ExecuteTaskUntilTimeout1(Runnable task, long timeout)
    {
        this.task = task;
        this.timeout = timeout;
    }

    public void run()
    {
        long startTime = System.currentTimeMillis();
        Thread worker = new Thread(task, "worker");
        worker.setDaemon(true);
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
                break;
            }
        }
    }
}

public class AppRunner2
{
    public static void main(String[] args)
    {
        new ExecuteTaskUntilTimeout1(() -> {
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

    }
}
