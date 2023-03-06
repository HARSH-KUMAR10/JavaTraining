package date06032023.linkedlistpractice;

public class ClassPassExample
{
    public static void main(String[] args)
    {
        MyDoublyLLExample<Integer> myDoublyLLExample = new MyDoublyLLExample();
        myDoublyLLExample.addFirst(10);
        myDoublyLLExample.addFirst(6);
        myDoublyLLExample.addLast(5);
        myDoublyLLExample.addLast(2);
        myDoublyLLExample.addFirst(8);
        myDoublyLLExample.addLast(11);
        myDoublyLLExample.addFirst(1);
        myDoublyLLExample.addFirst(4);
        myDoublyLLExample.addLast(7);
        myDoublyLLExample.addLast(3);
        myDoublyLLExample.addFirst(9);
        myDoublyLLExample.addLast(13);
        myDoublyLLExample.addFirst(12);
        System.out.println("Back view: "+myDoublyLLExample.traverseBack());
        System.out.println("Front view: "+myDoublyLLExample.traverseFront());
    }
}
