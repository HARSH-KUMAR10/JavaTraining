package date17032023.locks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LocksExample
{
    static int table = 8;
    static int sharedVariable = 1;

    static ReentrantLock reentrantLock = new ReentrantLock();
    void printTable(){
        try
        {
            reentrantLock.lock();
            System.out.println(Thread.currentThread().getName());
            System.out.println(table + " x " + sharedVariable + " = " + (table * sharedVariable++));
            Thread.sleep(500);
        }catch (Exception exception){
            System.out.println(exception);
        }finally
        {
            reentrantLock.unlock();
        }
    }

    public static void main(String[] args)
    {
        LocksExample locksExample = new LocksExample();
        Thread thread = new Thread(()->{
            while(sharedVariable<=10)
            {
                locksExample.printTable();
            }
        });
        Thread thread1 = new Thread(()->{
            while(sharedVariable<=10)
            {
                locksExample.printTable();
            }
        });
        thread.start();
        thread1.start();

    }
}
