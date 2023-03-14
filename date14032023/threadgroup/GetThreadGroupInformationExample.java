package date14032023.threadgroup;

public class GetThreadGroupInformationExample
{
    private static String sharedValue = null;
    public static void main(String[] args)
    {
        ThreadGroup threadGroup = new ThreadGroup("Harsh-Threads");
        Thread mainThread1 = new Thread(()->{
            System.out.println("Main thread started");
            try
            {
                Thread.sleep(2000);
            }
            catch (Exception exception)
            {
                System.out.println(exception);
            }
        });
        Thread harshThread1 = new Thread(threadGroup,()->{
            try
            {
                Thread.sleep(2000);
            }
            catch (Exception exception)
            {
                System.out.println(exception);
            }
            sharedValue="Harsh Kumar";
        });
        Thread harshThread2 = new Thread(threadGroup,()->{
            try
            {
                Thread.sleep(2000);
            }
            catch (Exception exception)
            {
                System.out.println(exception);
            }
            sharedValue+=" is using threads.";
        });

        System.out.println("------------------------------");
        System.out.println("main thread : "+Thread.currentThread().getState());
        System.out.println("main-thread-0 : "+mainThread1.getState());
        System.out.println("harsh-thread-0 : "+harshThread1.getState());
        System.out.println("harsh-thread-1 : "+harshThread2.getState());

        System.out.println("------------------------------\nAbout main thread group:");
        Thread.currentThread().getThreadGroup().list();
        System.out.println("------------------------------\nAbout harsh thread group:");
        threadGroup.list();
        mainThread1.start();
        harshThread1.start();
        harshThread2.start();
        System.out.println("------------------------------");
        System.out.println("main thread : "+Thread.currentThread().getState());
        System.out.println("main-thread-0 : "+mainThread1.getState());
        System.out.println("harsh-thread-0 : "+harshThread1.getState());
        System.out.println("harsh-thread-1 : "+harshThread2.getState());
        System.out.println("------------------------------\nAbout main thread group:");
        Thread.currentThread().getThreadGroup().list();
        System.out.println("------------------------------\nAbout harsh thread group:");
        threadGroup.list();
        try
        {
            mainThread1.join();
            System.out.println("------------------------------");
            System.out.println("main thread : "+Thread.currentThread().getState());
            System.out.println("main-thread-0 : "+mainThread1.getState());
            System.out.println("harsh-thread-0 : "+harshThread1.getState());
            System.out.println("harsh-thread-1 : "+harshThread2.getState());
            harshThread1.join();
            System.out.println("------------------------------");
            System.out.println("main thread : "+Thread.currentThread().getState());
            System.out.println("main-thread-0 : "+mainThread1.getState());
            System.out.println("harsh-thread-0 : "+harshThread1.getState());
            System.out.println("harsh-thread-1 : "+harshThread2.getState());
            harshThread2.join();
            System.out.println("------------------------------");
            System.out.println("main thread : "+Thread.currentThread().getState());
            System.out.println("main-thread-0 : "+mainThread1.getState());
            System.out.println("harsh-thread-0 : "+harshThread1.getState());
            System.out.println("harsh-thread-1 : "+harshThread2.getState());
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }

        System.out.println("------------------------------\nAbout main thread group:");
        Thread.currentThread().getThreadGroup().list();
        System.out.println("------------------------------\nAbout harsh thread group:");
        threadGroup.list();
        System.out.println("------------------------------");
        System.out.println(sharedValue);
        System.out.println("------------------------------");
        System.out.println("main thread : "+Thread.currentThread().getState());
        System.out.println("main-thread-0 : "+mainThread1.getState());
        System.out.println("harsh-thread-0 : "+harshThread1.getState());
        System.out.println("harsh-thread-1 : "+harshThread2.getState());
    }
}
