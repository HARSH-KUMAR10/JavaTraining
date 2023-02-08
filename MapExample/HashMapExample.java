package MapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("One","Eleven");
        map.put("Two","Twelve");
        map.put("Three","Thirteen");
        map.put("Four","Fourteen");
        map.put("Five","Fifteen");
        System.out.println("HashMap elements: "+map);
        System.out.println("Value for (key='Three'): "+map.get("Three"));
        System.out.println("Value for (key='Six'): "+map.get("Six"));
        System.out.println("Does map contains(value='Eleven'): "+map.containsValue("Eleven"));
        System.out.println("Does map contains(key='One'): "+map.containsKey("One"));
        System.out.println("Does map contains(value='Seventeen'): "+map.containsValue("Seventeen"));
        System.out.println("Does map contains(key='Eight'): "+map.containsKey("Eight"));
        Set<Map.Entry<String,String>> set = map.entrySet();
        System.out.println("Map as set: "+set);
        System.out.println("Get value from map(key:'One',default: 'Twenty'): "+map.getOrDefault("One","Twenty"));
        System.out.println("Get value from map(key:'Seven',default: 'Twenty'): "+map.getOrDefault("Seven","Twenty"));
        System.out.println("Adding new value if not present(Six-Sixteen): "+map.putIfAbsent("Six","Sixteen"));
        System.out.println("Adding new value if not present(Two-Twenty): "+map.putIfAbsent("Two","Twenty"));
        System.out.println("HashMap elements: "+map);
        System.out.println("Removing element(present): "+map.remove("Three"));
        System.out.println("Removing element(not present): "+map.remove("Seven"));
        System.out.println("HashMap elements: "+map);
        System.out.println("Key Set: "+map.keySet());
        System.out.println("value Set: "+map.values());
        System.out.println("HashMap elements: "+map);
        String sevenTeen = "Seventeen";
        String nineTeen = "Nineteen";
        System.out.println(map.computeIfPresent("Four",(key,value)->value=(key.length())+value));
        System.out.println(map.computeIfAbsent("Seven",(value)->sevenTeen.length()+sevenTeen));
        System.out.println("HashMap elements: "+map);
        System.out.println(map.computeIfPresent("Eight",(key,value)->value=(key.length())+value));
        System.out.println(map.computeIfAbsent("Seven",(value)->nineTeen.length()+nineTeen));
        System.out.println("HashMap elements: "+map);
    }
}
