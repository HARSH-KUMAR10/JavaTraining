package QueueExample;

import java.util.*;
//import java.lang.Integer;

public class ComparatorPriorityExample {
    public static void main(String[] args){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(5);
        queue.offer(2);
        queue.offer(4);
        queue.offer(7);
        queue.offer(3);
        queue.offer(6);
        queue.offer(9);
        queue.offer(8);
        System.out.println("Nums: "+queue);
        Collections.sort(queue);
        System.out.println("Nums: "+queue);
    }
}
