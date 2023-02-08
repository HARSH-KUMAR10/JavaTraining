package SetExample;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args){
        TreeSet<String> set = new TreeSet<>();
        set.add("One");
        set.add("Three");
        set.add("Four");
        set.add("Two");
        System.out.println("Set elements: "+set);
        System.out.println(set.ceiling("Five"));
        System.out.println(set.floor("horse"));
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.println(set.first());
        System.out.println("Set elements: "+set);
    }
}
