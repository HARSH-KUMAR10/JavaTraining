package JVM;

class SuperClass{
    SuperClass(){System.out.println("Superclass: constructor");}
}
class SubClass extends SuperClass{
    static final int a = 47; // compile time constants
    static int c;
    static final int b = (int)(Math.random()*50);
    static {System.out.println("SubClass: static initializer"+c);c=100;System.out.println(c);}

    SubClass(){System.out.println("SubClass: constructor");}
}

public class Example1 {
static {System.out.println("Example1: static initializer");}
    {System.out.println("Example1: instance initializer");}
    public static void main(String[] args){
    System.out.println("Subclass.a: "+SubClass.a);
    System.out.println("Subclass.b: "+SubClass.b);
    new SubClass();
}
}
