package date09032023.map;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public class SynchronizedHashMapWithThreads
{
    Map<Integer, String> hashMap = Collections.synchronizedMap(Map.of(1,"Hello",2,"How",3,"Are",4,"You"));

    void changeHashMap()
    {
        try
        {
            hashMap.put(5, "?");
        }
        catch (Exception exception)
        {
            System.out.println("Error while adding: " + exception);
        }
    }

    public static void main(String[] args)
    {
        try
        {
            SynchronizedHashMapWithThreads synchronizedHashMapWithThreads = new SynchronizedHashMapWithThreads();

            System.out.println(synchronizedHashMapWithThreads.hashMap);

            Thread thread = new Thread(synchronizedHashMapWithThreads::changeHashMap);

            Iterator<Map.Entry<Integer, String>> iterator = synchronizedHashMapWithThreads.hashMap.entrySet().iterator();

            System.out.println("Thread started");
            thread.start();
            System.out.println("Thread ended");
            System.out.println(synchronizedHashMapWithThreads.hashMap);

            while (iterator.hasNext())
            {
                Map.Entry<Integer, String> mapEntry = iterator.next();
                System.out.println(mapEntry);
            }
            Thread.sleep(2000);
            System.out.println(synchronizedHashMapWithThreads.hashMap);
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
