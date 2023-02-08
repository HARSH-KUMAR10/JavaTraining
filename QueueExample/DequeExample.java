package QueueExample;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args){
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Mercury");
        deque.add("Venus");
        deque.addFirst("Earth");
        deque.add("Mars");
        deque.offer("Jupiter");
        deque.add("Saturn");
        deque.offerLast("Uranus");
        deque.offerFirst("Neptune");
        System.out.println("Deque: "+deque);
    }
}
