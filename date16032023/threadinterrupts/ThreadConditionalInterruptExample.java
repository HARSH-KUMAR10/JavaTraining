package date16032023.threadinterrupts;

public class ThreadConditionalInterruptExample
{
    public static void main(String[] args)
    {
        try
        {
            Thread thread = new Thread(() -> {
                for (int iterator = 0; iterator < 5; iterator++)
                {
                    if (iterator == 2)
                    {
                        Thread.currentThread().interrupt();

                    }
                    System.out.println(Thread.currentThread().isInterrupted());
                    System.out.println("Current iteration : " + iterator);
                }
            });
            thread.start();
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
