package date15032023.deadlock;

public class DeadlockExample
{
    static String sharedResource1 = "Instructions for DB - read worked 1";
    static String sharedResource2 = "Instructions for Server - read worker 2";
    public static void main(String[] args)
    {

        Thread thread1 = new Thread(() -> {
            synchronized (sharedResource1)
            {
                System.out.println(Thread.currentThread().getName() + " - " + sharedResource1);
//                sharedResource1 = "Instructions for DB - read worked 2";
                try
                {
                    Thread.sleep(100);
                }
                catch (Exception exception)
                {
                    System.out.println(exception);
                }
                synchronized (sharedResource2)
                {
                    System.out.println(Thread.currentThread().getName() + " - " + sharedResource2);
//                    sharedResource2 = "Instructions for Server - read worked 2";
                }
            }

        });
        Thread thread2 = new Thread(() -> {
            synchronized (sharedResource2)
            {
                System.out.println(Thread.currentThread().getName() + " - " + sharedResource2);
//                sharedResource2 = "Instructions for Server - read worked 1";
                try
                {
                    Thread.sleep(100);
                }
                catch (Exception exception)
                {
                    System.out.println(exception);
                }
                synchronized (sharedResource1)
                {
                    System.out.println(Thread.currentThread().getName() + " - " + sharedResource1);
//                    sharedResource1 = "Instructions for DB - read worked 1";
                }
            }

        });
        thread1.start();
        thread2.start();
        System.out.println(Thread.currentThread().getName() + " - " + sharedResource1);
        System.out.println(Thread.currentThread().getName() + " - " + sharedResource2);
    }
}
