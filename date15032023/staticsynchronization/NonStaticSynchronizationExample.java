package date15032023.staticsynchronization;

public class NonStaticSynchronizationExample
{
    synchronized void multiply(int x)
    {
        try
        {
            for(int i=1;i<=10;i++){
                System.out.println(x+" x "+i+" = "+ (x*i));
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }

    public static void main(String[] args)
    {
        NonStaticSynchronizationExample nonStaticSynchronizationExample = new NonStaticSynchronizationExample();
        NonStaticSynchronizationExample nonStaticSynchronizationExample1 = new NonStaticSynchronizationExample();
        Thread thread1 = new Thread(()->{
            nonStaticSynchronizationExample.multiply(7);
        });
        Thread thread2 = new Thread(()->{
            nonStaticSynchronizationExample.multiply(8);
        });
        Thread thread3 = new Thread(()->{
            nonStaticSynchronizationExample1.multiply(9);
        });
        Thread thread4 = new Thread(()->{
            nonStaticSynchronizationExample1.multiply(6);
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
