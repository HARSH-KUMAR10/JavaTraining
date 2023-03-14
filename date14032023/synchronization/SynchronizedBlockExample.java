package date14032023.synchronization;

public class SynchronizedBlockExample
{
    static volatile boolean sharedFlag = true;

    static void customOperation(String updatedString)
    {
        try
        {
            synchronized (SynchronizedBlockExample.class)
            {
                if (sharedFlag)
                {
                    System.out.println("Thread printing is "+Thread.currentThread().getName()+" : ");
                    System.out.println("Shared");
                }
                else
                {
                    System.out.println("Thread printing is "+Thread.currentThread().getName()+" : ");
                    System.out.println(updatedString);
                }

                if(sharedFlag){
                    System.out.println("I am going to change the shared flag: "+Thread.currentThread().getName()+" : "+sharedFlag);
                }
                sharedFlag = !sharedFlag;
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }

    }

    public static void main(String[] args)
    {
        Thread thread = new Thread(() -> {
            customOperation("This is not visible");
        });
        Thread thread1 = new Thread(() -> {
            customOperation("This should be visible");
        });
        thread.start();
        thread1.start();
//        thread.start();
    }
}
