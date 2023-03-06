package date06032023.queuepractice;

class QueueExample<E>{
    class Node<E>{
        E a;
        Node next = null;
        Node last = null;
        Node(E b){
            a=b;
        }
    }
    Node rear = null;
    Node front = null;
    void add(E x){
        Node newNode = new Node(x);
        if(rear==null || front==null){
            rear=newNode;front=newNode;
        }else{
            newNode.last=front;
            front.next = newNode;
            front = front.next;
        }
    }
    E remove(){
        if(rear==null || front==null){
            return null;
        }else{
            E val = (E) rear.a;
            rear = rear.next;
            return val;
        }
    }
    E peek(){
        if(rear==null || front==null){
            return null;
        }else{
            return (E) rear.a;
        }
    }
}


// FIFO example
public class ProducerConsumerUsingQueue
{

    static QueueExample<String> myCircularQueue = new QueueExample();
    static void consumeJob(){
        while (true)
        {
            if (myCircularQueue.peek() != null)
            {
                if(myCircularQueue.peek().equals("end")){
                    break;
                }
                System.out.println("-----------------------------------------------\nStarting job...");
                try
                {
                    Thread.sleep(1000 * Math.round(Math.random() * 5));
                }
                catch (InterruptedException e)
                {
                    System.out.println(e);
                }
                System.out.println("Completed : " + myCircularQueue.remove()+"\n-----------------------------------------------------");
            }
            else
            {
                try
                {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
                System.out.println("No jobs for now");
            }
        }
        System.out.println("*---Consumed everything---*");
    }
    static void produceJob(String job){
        System.out.println("----------------------------------\nTrying to add job: "+job);
        try
        {
            Thread.sleep(1000*Math.round(Math.random()*5));
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        myCircularQueue.add(job);
        System.out.println("----------------------------------");
    }
    public static void main(String[] args)
    {
        Thread t1 = new Thread(()->{consumeJob();});
        t1.start();
        produceJob("job-1");
        produceJob("job-2");
        produceJob("job-3");
        produceJob("job-4");
        produceJob("job-5");
        produceJob("job-6");
        produceJob("job-7");
        produceJob("job-8");
        produceJob("end");
    }
}
