package date16032023.executors;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        try
        {
            System.out.println("Using single executor service : ");
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            for (int iterator = 0; iterator < 7; iterator++)
            {
                executorService.execute(() -> System.out.println("Executor service started a thread : " + Thread.currentThread().getName()
                                                                 + "\t\tThread group : " + Thread.currentThread().getThreadGroup().getName()));
            }
            executorService.shutdown();
            Thread.sleep(10000);
            System.out.println("Using fixed executor service : ");
            ExecutorService executorService1 = Executors.newFixedThreadPool(3);
            for (int iterator = 0; iterator < 7; iterator++)
            {
//                Thread.sleep(10000); for jconsole
                executorService1.execute(() -> System.out.println("Executor service started a thread : " + Thread.currentThread().getName()
                                                                  + "\t\tThread group : " + Thread.currentThread().getThreadGroup().getName()));
            }
            executorService1.shutdown();
            Thread.sleep(10000);
            System.out.println("Using cached executor service : ");
            ExecutorService executorService2 = Executors.newCachedThreadPool();
            for (int iterator = 0; iterator < 7; iterator++)
            {
                executorService2.execute(() -> System.out.println("Executor service started a thread : " + Thread.currentThread().getName()
                                                                  + "\t\tThread group : " + Thread.currentThread().getThreadGroup().getName()));
            }
            executorService2.shutdown();
            sc.nextLine();
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
