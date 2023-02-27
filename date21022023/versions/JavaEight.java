package date21022023.versions;

import java.util.LinkedList;

interface One{
    void doSomething();
}

public class JavaEight
{
    // Introduction to Lambda for functional interface
    static One one = () -> {
        System.out.println("working ...");
    };
    // Repeating Annotations
    // Stream API
    public static void main(String[] args)
    {
     one.doSomething();
        LinkedList<Float> ll =  new LinkedList();
        ll.add(1f);
        ll.add(2.6f);
        ll.add(3.3f);
        ll.add(1.7f);
        ll.add(2.4f);
        ll.stream().filter(x->x>2.2).map(x->(x+0.3+"f")).forEach(System.out::println);
    }
}
