package date09032023.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapWithThreads
{
    HashMap<Integer, String> hashMap = new HashMap<>();

    HashMapWithThreads()
    {
        hashMap.put(1, "Hello");
        hashMap.put(2, "How");
        hashMap.put(3, "Are");
        hashMap.put(4, "You");
    }

    void changeHashMap()
    {
        try
        {
            hashMap.put(5, "?");
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
            HashMapWithThreads hashMapWithThreads = new HashMapWithThreads();
            System.out.println(hashMapWithThreads.hashMap);
            Thread thread = new Thread(hashMapWithThreads::changeHashMap);

            Iterator<Map.Entry<Integer, String>> iterator = hashMapWithThreads.hashMap.entrySet().iterator();

            System.out.println("Thread started");
            thread.start();
            System.out.println("Thread ended");
            System.out.println(hashMapWithThreads.hashMap);

            while (iterator.hasNext())
            {
                Map.Entry<Integer, String> mapEntry = iterator.next();
                System.out.println(mapEntry);
            }
            Thread.sleep(2000);
            System.out.println(hashMapWithThreads.hashMap);
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
