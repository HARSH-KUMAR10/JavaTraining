package date18032023;

class ExecuteTaskUntilTimeout2 extends Thread
{
    Runnable task;

    long timeout;

    public ExecuteTaskUntilTimeout2(Runnable task, long timeout)
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
                try{
                    worker.interrupt();
                }catch(Exception exception){

                }
                break;
            }
        }
    }
}

public class AppRunner1
{
    public static void main(String[] args)
    {
        new ExecuteTaskUntilTimeout2(() -> {
            try
            {
                Thread.sleep(4000);
                System.out.println("MY TASK COMPLETED 1");
            }
            catch (Exception exception)
            {}
        }, 2000).start();
        new ExecuteTaskUntilTimeout2(() -> {
            try
            {
                Thread.sleep(4000);
                System.out.println("MY TASK COMPLETED 2");
            }
            catch (Exception exception)
            {}
        }, 5000).start();
        new ExecuteTaskUntilTimeout2(() -> {
            try
            {
                Thread.sleep(8000);
                System.out.println("MY TASK COMPLETED 3");
            }
            catch (Exception exception)
            {}
        }, 5000).start();

    }
}
