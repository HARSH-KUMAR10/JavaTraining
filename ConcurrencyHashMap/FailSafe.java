package ConcurrencyHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {
    public static void main(String[] args){
        /*HashMap<Integer,String> map = new HashMap<>();
        map.put(10,"Ten");
        map.put(20,"Twenty");
        map.put(30,"Thirty");
        map.put(40,"Fourty");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry);
            map.remove(20);
        }*/
        ConcurrentHashMap<Integer,String> map1 = new ConcurrentHashMap<>();
        map1.put(10,"Ten");
        map1.put(20,"Twenty");
        map1.put(30,"Thirty");
        map1.put(40,"Fourty");
        for(Map.Entry<Integer,String> entry : map1.entrySet()){
            System.out.println(entry);
            map1.remove(20);
        }
    }
}
