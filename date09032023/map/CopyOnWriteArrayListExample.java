package date09032023.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("==================== HashMap ======================");
            HashMap<Integer, String> hashMap = new HashMap<>();
            hashMap.put(3, "Three");
            hashMap.put(2, "Two");
            hashMap.put(4, "Four");
            hashMap.put(1, "One");
            System.out.println(hashMap);
            Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
            while (iterator.hasNext())
            {
                System.out.println(iterator.next());
//            hashMap.put(0,"Zero");
            }
            System.out.println(hashMap);

            System.out.println("========================= Concurrent Hash Map ===========================");
            ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
            concurrentHashMap.put(3, "Three");
            concurrentHashMap.put(2, "Two");
            concurrentHashMap.put(4, "Four");
            concurrentHashMap.put(1, "One");
            System.out.println(concurrentHashMap);
            Iterator<Map.Entry<Integer, String>> iterator1 = concurrentHashMap.entrySet().iterator();
            while (iterator1.hasNext())
            {
                System.out.println(iterator1.next());
                concurrentHashMap.put(0, "Zero");
            }
            System.out.println(concurrentHashMap);

            System.out.println("===================== Copy On Write Array List ===============================");
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.add("Hello");
            copyOnWriteArrayList.add("How");
            copyOnWriteArrayList.add("are");
            copyOnWriteArrayList.add("you");
            System.out.println(copyOnWriteArrayList);

            Iterator<String> iterator2 = copyOnWriteArrayList.iterator();
            boolean added = false;
            while(iterator2.hasNext()){
                System.out.println(iterator2.next());
                if(!added)
                {
                    copyOnWriteArrayList.remove("you");
                    copyOnWriteArrayList.add("they");
                    copyOnWriteArrayList.add("?");
                    added=true;
                }
            }
            System.out.println(copyOnWriteArrayList);
        }catch(Exception exception){
            System.out.println(exception);
        }
    }
}
