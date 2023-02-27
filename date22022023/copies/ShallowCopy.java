package date22022023.copies;

class MyClass{
    int x =10;
    String s = "Hello";
    void print(){
        System.out.println("int: "+x+"\nstring: "+s);
    }
}

public class ShallowCopy
{
    public static void main(String[] args)
    {
        MyClass myObject = new MyClass();
        myObject.print();
        MyClass myObject1 = myObject;
        myObject1.x = 20;
        myObject1.s = "Bye";
        myObject1.print();
        myObject.print();
    }
}
