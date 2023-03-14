package date10032023.threadsintroduction;

public class ThreadStatesExample
{
    public static void main(String[] args)
    {
        Thread threadStates = new Thread(()->{
            System.out.println("Running from thread");
            try
            {
                Thread.sleep(4000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        });
        System.out.println("Thread state: "+threadStates.getState());
        System.out.println("Starting a thread ...");
        threadStates.start();
        System.out.println("Thread state: "+threadStates.getState());
        System.out.println("Thread state: "+threadStates.getState());
        System.out.println("Thread state: "+threadStates.getState());

    }
}
