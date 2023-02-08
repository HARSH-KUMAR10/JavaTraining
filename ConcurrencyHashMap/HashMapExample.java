package ConcurrencyHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExample extends Thread{
    // Run code 3 4 time to see result
    Map<Integer, String> hashMap = new ConcurrentHashMap<>();
    public void run() {
        System.out.println("Before Sleep " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    // Child thread trying to add object
    System.out.println("After Sleep " + Thread.currentThread().getName());
    hashMap.put(3, "pink");
    System.out.println("Value inserted by:- "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
    HashMapExample m = new HashMapExample();
    //  HashmapFailCaseExample m2 = new HashmapFailCaseExample();
    m.hashMap.put(1, "Red");
    m.hashMap.put(2, "Green");
    System.out.println(m.hashMap);
    m.start();
    //  m2.start();
    Iterator it = m.hashMap.entrySet().iterator();
    while (it.hasNext()) {
        System.out.println(it.next() + " printed by " + Thread.currentThread().getName());
        Thread.sleep(1000);
    }
    System.out.println(m.hashMap);
}
}

