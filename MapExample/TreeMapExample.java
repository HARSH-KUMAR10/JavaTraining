package MapExample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String args[]){
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(3,"Third");
        treeMap.put(1,"First");
        treeMap.put(2,"Second");
        System.out.println("Tree map elements: "+treeMap);
        TreeMap<String,Integer> treeMap1 = new TreeMap<>();
        treeMap1.put("Abc",3);
        treeMap1.put("aBC",1);
        treeMap1.put("People",2);
        System.out.println("Tree map-1 elements: "+treeMap1);
        System.out.println("Get value for (key=Abc):"+treeMap1.get("Abc"));
        System.out.println("Get value for (key=ABC):"+treeMap1.get("ABC"));
        Map.Entry<String,Integer> entry = treeMap1.ceilingEntry("Abc");
        System.out.println(entry);
        Map.Entry<Integer,String> entry1 = treeMap.ceilingEntry(3);
        System.out.println(entry1);

    }
}
