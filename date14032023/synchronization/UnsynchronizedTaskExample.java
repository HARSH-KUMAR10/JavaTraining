package date14032023.synchronization;

public class UnsynchronizedTaskExample
{
    static void unsynchronizedTable(int x){
        try
        {
            for (int i = 1; i <= 10; i++)
            {
                System.out.println(x + " x " + i + " = " + (x * i));
                Thread.sleep(100);
            }
        }catch(Exception exception){
            System.out.println(exception);
        }
    }

    public static void main(String[] args)
    {
        try
        {
            Thread thread = new Thread(() -> {
                unsynchronizedTable(10);
            });
            Thread thread1 = new Thread(() -> {
                unsynchronizedTable(6);
            });
            thread1.start();
//            thread1.join();
            thread.start();
        }catch(Exception exception){
            System.out.println(exception);
        }
    }
}
