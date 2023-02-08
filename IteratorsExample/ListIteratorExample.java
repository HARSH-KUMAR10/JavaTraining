package IteratorsExample;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args){
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("One");
        arr1.add("Two");
        arr1.add("Three");
        arr1.add("four");
        arr1.add("Five");
        ListIterator<String> ltr = arr1.listIterator();
        System.out.println(arr1);
        // Lowercase Three, remove four and add Four
        while(ltr.hasNext()){
            String val = ltr.next();
            if(val=="Three"){
                ltr.set("three");
            }else if(val=="four"){
                ltr.set("Four");
            }
        }
        System.out.println(arr1);
    }
}
