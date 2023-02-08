package LegacyClass;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args){
        Hashtable<String,Integer> hst = new Hashtable<>();
        hst.put("A",1);
        hst.put("B",2);
        hst.put("C",3);
        hst.put("D",4);
        hst.put("E",5);
        System.out.println(hst.get("C"));
        System.out.println(hst.contains(4));
        System.out.println(hst.contains(7));
        System.out.println(hst.containsKey("B"));
        System.out.println(hst.containsKey("F"));
        System.out.println(hst.containsValue(4));
        System.out.println(hst.containsValue(0));
        System.out.println(hst.keySet());
    }
}
