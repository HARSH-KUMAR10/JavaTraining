package date16032023.threadinterrupts;

public class ThreadInterruptExample1
{
    public static void main(String[] args)
    {
        try
        {
            Thread thread = new Thread(() -> {
                try
                {
                    Thread.sleep(1000);
                    System.out.println("task");
                }
                catch (InterruptedException interruptedException)
                {
                    System.out.println("Thread interrupted : " + interruptedException);
                }
                System.out.println("Thread running ...");
            });
            thread.start();
            try
            {
                thread.interrupt();
            }catch (Exception exception){
                System.out.println(exception);
            }
            thread.join();
            System.out.println("Main running ...");
        }catch(Exception exception){
            System.out.println(exception);
        }

    }
}
