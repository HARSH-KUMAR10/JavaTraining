package MapExample;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args){
        ConcurrentHashMap<Integer,String > chm = new ConcurrentHashMap<>();
        chm.put(1,"Z");
        chm.put(2,"Y");
        chm.put(3,"X");
        chm.put(4,"W");
        chm.put(5,"V");
        chm.put(6,"U");
        System.out.println("Concurrent Hash Map Elements: "+chm);
    }
}
