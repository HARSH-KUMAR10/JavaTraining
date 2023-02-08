package QueueExample;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args){
        Queue<String> jobQueue = new ArrayDeque<>();
        jobQueue.add("top");
        jobQueue.add("ps -eLF");
        jobQueue.add("pstree");
        jobQueue.add("vmstat");
        jobQueue.add("mpstat"); // returns error if unable to add element
        System.out.println("Queue elements: "+jobQueue);
        System.out.println("First element of queue: "+jobQueue.element());
        jobQueue.offer("pidstat"); // return false if unable to add element
        System.out.println("Queue elements: "+jobQueue);
        System.out.println("Peeking element: "+jobQueue.peek());
        System.out.println("Pooling(Removing) element: "+jobQueue.poll());
        System.out.println("Removing element: "+jobQueue.remove());
        System.out.println("Queue elements: "+jobQueue);
    }
}
