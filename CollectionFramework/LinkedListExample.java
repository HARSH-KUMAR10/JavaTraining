package CollectionFramework;

import java.util.ArrayList;

class LinkedList<E>{
    private class Node{
        E e;
        Node next,last;
        Node(E e){
            this.e = e;
            this.next=null;
            this.last=null;
        }
    }
    Node head = null;
    void addLast(E e){
        E val = e;
        Node newNode = new Node(e);
        if(head==null){
            head=newNode;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.last = temp;
        }
    }
    void addFirst(E e){
        Node newNode = new Node(e);
        newNode.next = head;
        head.last = newNode;
        head=newNode;
    }
    E removeFirst(){
        E ret = head.e;
        head = head.next;
        return ret;
    }
    E removeLast(){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        E ret = temp.next.e;
        temp.next=null;
        return ret;
    }
    int size(){
        Node temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    ArrayList<E> toArrayList(){
        ArrayList<E> arr = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            arr.add(temp.e);
            temp = temp.next;
        }
        return arr;
    }
}

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.addLast(2);
        ll1.addFirst(3);
        ll1.addLast(4);
        ll1.addFirst(5);
        System.out.println("Size of linked list1: "+ll1.size());
        ArrayList<Integer> arr1 = ll1.toArrayList();
        System.out.println("Linked List1(ArrayList): "+arr1);
        System.out.println("Removed first element: "+ll1.removeFirst());
        System.out.println("Removed last element: "+ll1.removeLast());
        System.out.println("Size of linked list1: "+ll1.size());
        ArrayList<Integer> arr3 = ll1.toArrayList();
        System.out.println("Linked List1(ArrayList): "+arr3);

        LinkedList<String> ll2 = new LinkedList<>();
        ll2.addLast("Hello");
        ll2.addFirst("Bye");
        ll2.addLast("Working");
        System.out.println("\n---------------------------\nSize of linked list2: "+ll2.size());
        ArrayList<String> arr2 = ll2.toArrayList();
        System.out.println("Linked List1(ArrayList): "+arr2);
        System.out.println("Removed last element: "+ll2.removeLast());
        System.out.println("Removed first element: "+ll2.removeFirst());
        System.out.println("Size of linked list1: "+ll2.size());
        ArrayList<String> arr4 = ll2.toArrayList();
        System.out.println("Linked List1(ArrayList): "+arr4);
        System.out.println("----------------------------");
    }
}
