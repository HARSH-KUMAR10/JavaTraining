package StreamsExample;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream1Example {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        Stream<Integer> arrStream = arr.stream();
        arrStream.forEach(n-> System.out.print(n+", "));
        System.out.println("\nStream used once");
        arr.stream().map(n->n*2).sorted().forEach(n-> System.out.print(n+", "));
        System.out.println("\nMultiple streams together");
        //Stream Once consumed can't be reused
//        arrStream.forEach(n-> System.out.print(n+", "));
//        System.out.println("\nUnable to use Stream second time.");
    }
}
