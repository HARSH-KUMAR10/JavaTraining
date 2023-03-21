package date16032023.executors;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceInvokeExample
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
            String randomTask = executorService.invokeAny(callables);
            System.out.println(randomTask);
            executorService.shutdown();
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
