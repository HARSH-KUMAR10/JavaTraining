package date16032023;

public class SynchronizedBlockMonitorExample
{
    int sharedValue = 10;
    void printValues(int salt){
        System.out.println("initial value : "+sharedValue);
        try
        {
            Thread.sleep(Math.round(Math.random()*2)*1000);
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
        sharedValue+=salt;
        try
        {
            Thread.sleep(Math.round(Math.random()*2)*1000);
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
        System.out.println("New value : "+sharedValue);
    }

    void printValuesSync(int salt){
        synchronized (this)
        {
            System.out.println("initial value : " + sharedValue);
        try
        {
            Thread.sleep(Math.round(Math.random()*2)*1000);
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
            sharedValue += salt;
        try
        {
            Thread.sleep(Math.round(Math.random()*2)*1000);
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
            System.out.println("New value : " + sharedValue);
        }
    }

    public static void main(String[] args)
    {
        SynchronizedBlockMonitorExample synchronizedBlockMonitorExample = new SynchronizedBlockMonitorExample();
        Thread thread = new Thread(()->{
            synchronizedBlockMonitorExample.printValues(5);
        });
        Thread thread1 = new Thread(()->{
            synchronizedBlockMonitorExample.printValues(4);
        });
//        thread.start();
//        thread1.start();
        Thread thread2 = new Thread(()->{
            synchronizedBlockMonitorExample.printValuesSync(7);
        });
        Thread thread3 = new Thread(()->{
            synchronizedBlockMonitorExample.printValuesSync(1);
        });
        thread2.start();
        thread3.start();
    }
}
