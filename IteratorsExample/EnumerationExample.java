package IteratorsExample;

import java.util.Hashtable;
import java.util.Enumeration;
public class EnumerationExample {
    public static void main(String[] args){
        Hashtable<Integer,String> hst = new Hashtable<>();
        hst.put(1,"One");
        hst.put(2,"Two");
        hst.put(3,"Three");
        hst.put(6,"Six");
        hst.put(5,"Five");
        Enumeration Enum = hst.elements();
        while(Enum.hasMoreElements()){
            System.out.println(Enum.nextElement());
        }
    }
}
