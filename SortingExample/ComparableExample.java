package SortingExample;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

class MyDS implements Comparable<MyDS>{
    String name;
    int number;
    MyDS(String s,int a){
        name=s;
        number=a;
    }
    public int compareTo(MyDS e){
        return this.name.charAt(0)==e.name.charAt(0)?0:this.name.charAt(0)>e.name.charAt(0)?1:-1;
    }
}

public class ComparableExample {
    public static void main(String[] args){
        ArrayList<MyDS> arr = new ArrayList<>();
        arr.add(new MyDS("Process Control Block",9));
        arr.add(new MyDS("Program Counter",8));
        arr.add(new MyDS("Stack Pointer",7));
        arr.add(new MyDS("cpu Register",6));
        arr.add(new MyDS("I/O Information",5));
        arr.add(new MyDS("Account Information",4));
        arr.add(new MyDS("Priority",3));
        arr.add(new MyDS("Process ID",2));
        arr.add(new MyDS("State",1));
        Collections.sort(arr);
        ListIterator<MyDS> ltr = arr.listIterator();
        while(ltr.hasNext()){
            MyDS temp = ltr.next();
            System.out.print("["+temp.name+", "+temp.number+"], ");
        }
    }
}
