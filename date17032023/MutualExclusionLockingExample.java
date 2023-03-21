package date17032023;

public class MutualExclusionLockingExample
{
    static int tableNumber = 7;

    static  int sharedIterator = 1;

    synchronized void printTable(){
        System.out.println(tableNumber+" x "+ sharedIterator+ " = "+ (tableNumber*sharedIterator++));
        if(sharedIterator>=10){
            notifyAll();
        }else
        {
            notify();
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args)
    {
        MutualExclusionLockingExample mutualExclusionLockingExample = new MutualExclusionLockingExample();
        Thread thread = new Thread(()->{
            while(sharedIterator<=10){
                System.out.println("----------- Running "+Thread.currentThread().getName()+" --------------------");
                mutualExclusionLockingExample.printTable();
            }
        });
        Thread thread1 = new Thread(()->{
            while(sharedIterator<=10){
                System.out.println("----------- Running "+Thread.currentThread().getName()+" --------------------");
                mutualExclusionLockingExample.printTable();
            }
        });
        thread.start();
        thread1.start();
    }

}
