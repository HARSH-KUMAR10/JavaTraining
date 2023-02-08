package ConcurrencyHashMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
//            list.add(50);
        }
    }
}
