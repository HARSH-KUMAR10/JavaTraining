package Date11022023.CollectionFramework;

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
}

public class QueueFromLL {
    public static void main(String[] args) {
        QueueExample<Integer> qll = new QueueExample<>();
        qll.add(10);
        qll.add(20);
        qll.add(30);
        qll.add(40);
        qll.add(50);
        System.out.print(qll.remove()+", ");
        System.out.print(qll.remove()+", ");
        System.out.print(qll.remove()+", ");
        System.out.print(qll.remove()+", ");
        System.out.print(qll.remove()+", ");
        System.out.println(qll.remove());
    }
}
