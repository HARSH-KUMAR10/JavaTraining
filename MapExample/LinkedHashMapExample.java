package MapExample;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(1,"ek");
        lhm.put(2,"do");
        lhm.put(3,"teen");
        lhm.put(4,"char");
        lhm.put(5,"panch");
        System.out.println("Map elements: "+lhm);
        System.out.println("Get elements(key:3): "+lhm.get(3));
        System.out.println("Get elements(key:6): "+lhm.get(6));
        System.out.println("Get Or Default elements(key:6,default:Che): "+lhm.getOrDefault(6,"Che"));
        System.out.println("Check if map contains (4=char): ["+lhm.containsKey(4)+":"+lhm.containsValue("char")+"]");
        System.out.println("Check if map contains (6=che): ["+lhm.containsKey(6)+":"+lhm.containsValue("che")+"]");
        System.out.println("Set of all keys: "+lhm.keySet());
        System.out.println("Set of all values: "+lhm.values());
        System.out.println("Set of Map.Entry: "+lhm.entrySet());
        System.out.println("-------------------putIfAbsent--------------------");
        lhm.put(3,"three");
        System.out.println("Map elements: "+lhm);
        lhm.putIfAbsent(4,"four");
        lhm.putIfAbsent(6,"che");
        System.out.println("Map elements: "+lhm);
        System.out.println("-------------------ComputeIfPresent--------------------");
        System.out.println("If not present (key=7): ");
        System.out.println(lhm.computeIfPresent(7,(key,value)->value="Saat"));
        System.out.println("If present (key=3): ");
        System.out.println(lhm.computeIfPresent(3,(key,value)->value="teen"));
        System.out.println("Map elements: "+lhm);
        System.out.println("-------------------ComputeIfAbsent--------------------");
        System.out.println("If absent (key=7): ");
        System.out.println(lhm.computeIfAbsent(7,(value)->"Saat"));
        System.out.println("If not absent (key=3): ");
        System.out.println(lhm.computeIfAbsent(3,(value)->"Teen"));
        System.out.println("Map elements: "+lhm);
        System.out.println("-------------------Compute--------------------");
        System.out.println("If absent (key=7): ");
        System.out.println(lhm.computeIfAbsent(7,(value)->("Saat")));
        System.out.println("If not absent (key=3): ");
        System.out.println(lhm.computeIfAbsent(3,(value)->"Teen"));
        System.out.println("Map elements: "+lhm);
    }
}
