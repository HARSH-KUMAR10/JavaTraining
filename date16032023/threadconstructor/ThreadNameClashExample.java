package date16032023.threadconstructor;

public class ThreadNameClashExample
{
    public static void main(String[] args)
    {
        Thread thread = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        Thread thread1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        },"Thread-0");
        Thread.currentThread().getThreadGroup().list();
        thread.start();
        thread1.start();
        Thread.currentThread().getThreadGroup().list();
    }
}
