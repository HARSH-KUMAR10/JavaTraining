package SortingExample;

import java.util.*;

class NameCompare implements Comparator<MyDS>{
    @Override
    public int compare(MyDS myDS, MyDS t1) {
        return myDS.name.charAt(0)==t1.name.charAt(0)?1:myDS.name.charAt(0)<t1.name.charAt(0)?1:-1;
    }
}

class NumberCompare implements Comparator<MyDS>{
    public int compare(MyDS t1,MyDS t2){
        return t1.number==t2.number?0:t1.number>t2.number?1:-1;
    }
}

public class ComparatorExample {
    public static void main(String[] args){
        LinkedList<MyDS> ll = new LinkedList<>();
        ll.add(new MyDS("New State",1));
        ll.add(new MyDS("Terminated",7));
        ll.addFirst(new MyDS("Ready",2));
        ll.add(new MyDS("Running",3));
        ll.addFirst(new MyDS("Suspend Wait",5));
        ll.addFirst(new MyDS("Suspend Ready",6));
        ll.addFirst(new MyDS("Wait",4));
        System.out.println("Linked List without sort: ");
        Iterator<MyDS> itr = ll.iterator();
        while(itr.hasNext()){
            MyDS node = itr.next();
            System.out.print("["+node.name+", "+node.number+"], ");
        }
        Collections.sort(ll,new NameCompare());
        System.out.println("\nLinked List sorted by name: ");
        itr = ll.iterator();
        while(itr.hasNext()){
            MyDS node = itr.next();
            System.out.print("["+node.name+", "+node.number+"], ");
        }
        Collections.sort(ll,new NumberCompare());
        System.out.println("\nLinked list sorted by number: ");
        itr = ll.iterator();
        while(itr.hasNext()){
            MyDS node = itr.next();
            System.out.print("["+node.name+", "+node.number+"], ");
        }
    }
}
