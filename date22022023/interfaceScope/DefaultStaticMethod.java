package date22022023.interfaceScope;

@FunctionalInterface
interface MyInterface{
    static void one(){
        System.out.println("one");
    }
    default void two(){
        System.out.println("two");
    }
    void three();
//    void four();
}

public class DefaultStaticMethod implements MyInterface
{
    public static void one(){
        System.out.println("One");
    }
    public void two(){
        System.out.println("Two");
    }
    public void three(){
        System.out.println("Three");
    }
//    Error

    public static void main(String[] args)
    {
        MyInterface.one();//interface static method
        MyInterface mi = () -> {
                System.out.println("Three");
        };
        mi.two();// over-hidding
        mi.three();//overridding
        DefaultStaticMethod dsm = new DefaultStaticMethod();
        dsm.one();//class static method
        dsm.two();// over-hidding
        dsm.three();//overridding
    }
}
