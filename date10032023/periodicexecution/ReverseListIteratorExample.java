package date10032023.periodicexecution;

import java.util.*;

public class ReverseListIteratorExample
{
    public static void main(String[] args)
    {
        List<Integer> arrayList = List.of(10,20,30,40,50,60,70,80,90);
        ListIterator listIterator = arrayList.listIterator(7);
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
