package date24022023;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class UpperBounded<T extends Number>{
    private T a;
    private T b;
    UpperBounded(T x, T y){
        a = x; b = y;
    }
    void sum(){
        System.out.println(a+" "+b);
    }
}

class LowerBounded{
    void showList(List<? super LinkedList> list){
        System.out.println(list);
    }
}

public class GenericsWildcardsExample
{
    public static void main(String[] args)
    {
        UpperBounded bounded = new UpperBounded(1,3);
        bounded.sum();
        UpperBounded bounded1 = new UpperBounded(1.3,3.4);
        bounded1.sum();
        // String will not be allowed as only child of Number or Number i allowed
//        UpperBounded bounded2 = new UpperBounded("a","b");
//        bounded2.sum();
        Deque<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        List<Deque> list = List.of(q,q,q);
        LowerBounded lowerBounded = new LowerBounded();
        lowerBounded.showList(list);
    }
}
