package date16032023.threadconstructor;

public class ThreadConstructorExample
{
    public static void main(String[] args)
    {
        try
        {
            Thread thread = new Thread();
            thread.start(); // default implementation of run method is used - empty
            Thread thread1 = new Thread("Thread-0");
            thread1.start();
            Thread thread2 = new Thread(() ->
            {
                System.out.println("Printing from thread - " + Thread.currentThread().getName());
            });
            thread2.start();
            Thread thread3 = new Thread(() ->
            {
                System.out.println("Printing from thread - " + Thread.currentThread().getName());
            }, "Runnable-Name");
            thread3.start();
            ThreadGroup threadGroup = new ThreadGroup("Thread-Group-0");
            Thread thread4 = new Thread(threadGroup, () ->
            {
                System.out.println("Printing from thread - " + Thread.currentThread().getName()
                                   + "\tThread Group - " + Thread.currentThread().getThreadGroup().getName());
            });
            thread4.start();
            Thread thread5 = new Thread(threadGroup, "Thread-0");// Thread with thread group and name only no run method implementation
            thread5.start();
            Thread thread6 = new Thread(threadGroup, () -> {
                System.out.println("Printing from thread - " + Thread.currentThread().getName()
                                   + "\tThread Group - " + Thread.currentThread().getThreadGroup().getName());
            }, "Thread-0");
            thread6.start();
            Thread thread7 = new Thread(threadGroup, () -> {
                System.out.println("Printing from thread - " + Thread.currentThread().getName()
                                   + "\tThread Group - " + Thread.currentThread().getThreadGroup().getName()
                                   + "Thread stack size - " + Thread.currentThread().countStackFrames());
            }, "Thread-0", 10);
            thread7.start();
        }catch (Exception exception){
            System.out.println(exception);
        }
    }
}
