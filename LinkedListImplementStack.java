package date06032023;

class MyLLStack<E>{
    class Node{
        E data;
        Node next;
        Node(E e){
            data = e;
            next = null;
        }
    }
    Node head = null;
    void push(E e){
        Node toAdd = new Node(e);
        if (head != null)
        {
            toAdd.next = head;
        }
        head = toAdd;
    }
    E pop(){
        if(head == null){
            return null;
        }else{
            E ret = head.data;
            head = head.next;
            return ret;
        }
    }
}

public class LinkedListImplementStack
{
    public static void main(String[] args)
    {
        MyLLStack<Integer> myStack = new MyLLStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }
}
