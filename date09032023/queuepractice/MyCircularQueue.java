package date09032023.queuepractice;

// Circular Queue
public class MyCircularQueue<E>
{
    static final int maxSizeOfQueue = 5;

    private E[] circularQueue = (E[]) new Object[maxSizeOfQueue];

    private int front = -1, rear = -1;

    void add(E e)
    {
        if (front == -1 || rear == -1)
        {
            circularQueue[0] = e;
            front = 0;
            rear = 0;
        }
        else if ((rear + 1) % maxSizeOfQueue == front)
        {
            System.out.println("Queue is overflow..");
        }
        else
        {
            rear = (rear + 1) % maxSizeOfQueue;
            circularQueue[rear] = e;
        }
    }

    E remove()
    {
        if((front==-1) && (rear==-1))  // condition to check queue is empty
        {
            System.out.println("\nQueue is underflow..");
            return null;
        }
        else if(front==rear)
        {
            front=-1;
            rear=-1;
            return null;
        }
        else
        {
            E ret = circularQueue[front];
            front=(front+1)%maxSizeOfQueue;
            return ret;
        }
    }

    E peek()
    {
        if (rear == -1) return null;
        return circularQueue[rear];
    }

    void show()
    {
        int i=front;
        if(front==-1 && rear==-1)
        {
            System.out.println("\n Queue is empty..");
        }
        else
        {
            System.out.println("\nElements in a Queue are :");
            while(i<=rear)
            {
                System.out.print( circularQueue[i] + ",");
                i=(i+1)%maxSizeOfQueue;
            }
        }

    }
}
