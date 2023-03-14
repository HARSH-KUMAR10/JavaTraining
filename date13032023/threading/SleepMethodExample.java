package date13032023.threading;

public class SleepMethodExample
{
    static void waitAndPrint(long time, String message)
    {
        Thread thread = new Thread(() ->
        {
            try
            {
                Thread.sleep(time);
                System.out.println(message);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        });
        thread.start();
    }

    public static void main(String[] args)
    {
        waitAndPrint(4000, "Print after 4 seconds");

        waitAndPrint(3000, "Print after 3 seconds");

        waitAndPrint(2000, "Print after 2 seconds");

        waitAndPrint(1000, "Print after 1 seconds");
    }
}
