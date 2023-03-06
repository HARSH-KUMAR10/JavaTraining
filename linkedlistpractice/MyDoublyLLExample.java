package date06032023.linkedlistpractice;

public class MyDoublyLLExample<E>
{
    private class Node{
        E data;
        Node previous = null;
        Node next = null;
        Node(E e){
            data = e;
        }
    }
    private Node head = null;

    void addFirst(E e){
        Node toAdd = new Node(e);
        if(head!=null){
            toAdd.next = head;
            head.previous = toAdd;
        }
        head = toAdd;
    }

    void addLast(E e){
        Node toAdd = new Node(e);
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = toAdd;
        toAdd.previous=temp;
    }
    E removeFirst(){
        E ret = head.data;
        head = head.next;
        head.previous=null;
        return ret;
    }
    E removeLast(){
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        E ret = temp.next.data;
        temp.next=null;
        return ret;
    }
    String traverseFront(){
        String ret = "";
        Node temp = head;
        while(temp!=null){
            ret+=temp.data;
            if(temp.next!=null){
                ret+=", ";
            }
            temp = temp.next;
        }
        return ret;
    }
    String traverseBack(){
        String ret = "";
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        while(temp!=null){
            ret+=temp.data;
            if(temp.previous!=null){
                ret+=", ";
            }
            temp = temp.previous;
        }
        return ret;
    }
}
