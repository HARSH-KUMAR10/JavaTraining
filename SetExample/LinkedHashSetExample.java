package SetExample;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(2);
        set.add(6);
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(7);
        System.out.println("Linked Hash Set: "+set);
        System.out.println("Remove Element: "+set.remove(6));
        System.out.println("Linked Hash Set: "+set);
        System.out.println("Remove Element: "+set.remove(2));
        System.out.println("Remove Element: "+set.remove(4));
        System.out.println("Remove Element: "+set.remove(1));
        System.out.println("Linked Hash Set: "+set);
    }
}
