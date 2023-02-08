package QueueExample;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String args[]){
        Queue<String> priorityQ = new PriorityQueue<>();
        priorityQ.add("New State");
        priorityQ.add("Ready");
        priorityQ.add("Running");
        priorityQ.add("Wait");
        priorityQ.add("Suspend Wait");
        priorityQ.add("Suspend Ready");
        priorityQ.offer("Terminated");
        System.out.println("Priority Queue: "+priorityQ);
        System.out.println("Queue top element: "+priorityQ.element());
        System.out.println("Queue top element: "+priorityQ.peek());
        System.out.println("Queue remove top: "+priorityQ.remove());
        System.out.println("Queue poll(remove) top: "+priorityQ.poll());
        System.out.println("Priority Queue: "+priorityQ);
        PriorityQueue<Integer> prNum = new PriorityQueue<>();
        prNum.add(3);
        prNum.add(4);
        prNum.add(7);
        prNum.add(2);
        prNum.add(6);
        prNum.add(1);
        prNum.add(5);
        System.out.println("Priority Number: "+prNum);
        for(Integer num:prNum){
            System.out.print(num+", ");
        }
        System.out.println("\nRemove element: "+prNum.remove());
        System.out.println("Poll element: "+prNum.poll());
        System.out.println("Remove element: "+prNum.remove());
        System.out.println("Remove element: "+prNum.remove());
        System.out.println("Poll element: "+prNum.poll());
        System.out.println("Remove element: "+prNum.remove());
        System.out.println("Poll element: "+prNum.poll());
        try {
            System.out.println("Remove element: " + prNum.remove());
        }catch(NoSuchElementException e){
            System.out.println("Queue remove exception"+e);
        }
        System.out.println("Poll element: "+prNum.poll());

    }
}
