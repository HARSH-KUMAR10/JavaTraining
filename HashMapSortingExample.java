package date06032023;

import java.util.*;

public class HashMapSortingExample
{
    public static void main(String[] args)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(3, -6);
        map.put(1, 2);
        map.put(-1, 8);
        map.put(2, 3);
        map.put(-2, 5);
        map.put(0, 4);
        map.put(-3, -4);

        System.out.println("HashMap preserves no insertion order.");
        map.forEach((k, v) -> {
            System.out.print(k + "=" + v + ", ");
        });

        System.out.println("\n\nTreeMap providing ordered map based on key: ");
        TreeMap treeMap = new TreeMap(map);
        treeMap.forEach((k, v) -> {
            System.out.print(k + "=" + v + ", ");
        });

        System.out.println("\n\nLinkedHashMap providing ordered map based on values");
        List<Map.Entry<Integer,Integer>> mapEntries = new LinkedList<>(map.entrySet());
        Collections.sort(mapEntries, new Comparator<Map.Entry<Integer, Integer>>()
        {
            @Override
            public int compare(Map.Entry<Integer, Integer> t1, Map.Entry<Integer, Integer> t2)
            {
                return t1.getValue().compareTo(t2.getValue());
            }
        });

        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        mapEntries.forEach(item->{
            linkedHashMap.put(item.getKey(),item.getValue());
        });
        linkedHashMap.forEach((key,value)->{
            System.out.print(key+"="+value+", ");
        });
        System.out.println();
    }
}
