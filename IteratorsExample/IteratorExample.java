package IteratorsExample;

import java.util.LinkedList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args){
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(5);
        Iterator<Integer> itr = list1.iterator();
        int previous = 0;
        while(itr.hasNext()) { // Check next element availability
            int cursor = itr.next(); // return current element
            if (previous + 1 != cursor) {
                System.out.println(cursor);
                itr.remove(); // remove current element
                previous+=1;
            } else {
                previous = cursor;
            }
        }
        System.out.println(list1);
    }
}
