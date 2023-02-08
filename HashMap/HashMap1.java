package HashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMap1 {
    public static void main(String[] args){
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1,"One");
        map1.put(2,"two");
        System.out.println("HashMap: "+map1);
        TreeMap<Integer,String> map2 = new TreeMap<>();
        map2.put(3,"Three");
        map2.put(1,"1");
        System.out.println("TreeMap: "+map2);
        map1.putAll(map2);
        System.out.println("HashMap: "+map1);
    }
}
