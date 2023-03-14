package date13032023.threading;

public class ThreadTimedJoinExample
{
    static int X = 10;

    static void showX()
    {
        System.out.println(X);
    }

    public static void main(String[] args)
    {
        try
        {
            System.out.println("Main Started");
            Thread thread = new Thread(() -> {
                System.out.println("Thread Started");
                try
                {
                    System.out.println("Running Thread");
                    Thread.sleep(1000);
//                    Thread.sleep(5000);
                    showX();
                    X = 20;
                    System.out.println("Thread Ended");
                }
                catch (Exception exception)
                {
                    System.out.println();
                }
            });
            thread.start();
            showX();
            System.out.println("Waiting for thread to complete it's job");
            thread.join(5000);
//            thread.join(1000);
            showX();
            System.out.println("Main Ended");

        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
