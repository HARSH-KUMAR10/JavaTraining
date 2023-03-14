package date09032023.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapWithThreads
{
    ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

    ConcurrentHashMapWithThreads()
    {
        concurrentHashMap.put(1, "Hello");
        concurrentHashMap.put(2, "How");
        concurrentHashMap.put(3, "Are");
        concurrentHashMap.put(4, "You");
    }

    void changeConcurrentHashMap()
    {
        try
        {
            concurrentHashMap.put(5, "?");
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }

    public static void main(String[] args)
    {
        try
        {
            ConcurrentHashMapWithThreads concurrentHashMapWithThreads = new ConcurrentHashMapWithThreads();
            System.out.println(concurrentHashMapWithThreads.concurrentHashMap);
            Thread thread = new Thread(concurrentHashMapWithThreads::changeConcurrentHashMap);

            Iterator<Map.Entry<Integer, String>> iterator = concurrentHashMapWithThreads.concurrentHashMap.entrySet().iterator();

            System.out.println("Thread started");
            thread.start();
            System.out.println("Thread ended");
            System.out.println(concurrentHashMapWithThreads.concurrentHashMap);

            while (iterator.hasNext())
            {
                Map.Entry<Integer, String> mapEntry = iterator.next();
                System.out.println(mapEntry);
            }
            Thread.sleep(2000);
            System.out.println(concurrentHashMapWithThreads.concurrentHashMap);
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
