package date16032023.executors;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class ExecutorServiceInvokeAllExample
{
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Set<Callable<String>> callables = new HashSet<>();
        callables.add(() -> "Task 6");
        callables.add(() -> "Task 5");
        callables.add(() -> "Task 4");
        callables.add(() -> "Task 3");
        callables.add(() -> "Task 2");
        callables.add(() -> "Task 1");
        try
        {
            List<Future<String>> randomStringList = executorService.invokeAll(callables);
            for(Future<String> randomString : randomStringList){
                System.out.println(randomString.get());
            }
            executorService.shutdown();
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
