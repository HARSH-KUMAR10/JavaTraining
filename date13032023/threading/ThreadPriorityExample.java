package date13032023.threading;

public class ThreadPriorityExample
{
    public static void main(String[] args)
    {
        try
        {
            Thread thread = new Thread(() -> {
                System.out.println("thread-0, priority "+Thread.currentThread().getPriority());
            });
            Thread thread1 = new Thread(() -> {
                System.out.println("thread-1, priority "+Thread.currentThread().getPriority());
            });
            Thread thread2 = new Thread(() -> {
                System.out.println("thread-2, priority "+Thread.currentThread().getPriority());
            });
            System.out.println("Thread-0, initial priority: " + thread.getPriority());
            System.out.println("Thread-1, initial priority: " + thread1.getPriority());
            System.out.println("Thread-2, initial priority: " + thread2.getPriority());
            thread.setPriority(10);
            thread1.setPriority(3);
            thread2.setPriority(1);
            try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            thread2.start();
            thread1.start();
            thread.start();
        }catch (Exception exception){
            System.out.println(exception);
        }

    }
}
