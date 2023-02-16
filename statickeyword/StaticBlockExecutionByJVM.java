package date16022023.statickeyword;


public class StaticBlockExecutionByJVM
{
    // Non static data members are not visible unless object is created
    int nonStaticVariable = 10;

    // static variables are visible everywhere inside the class and is accessible outside using className
    static int staticVariable = 20;

    // Static block executed by JVM while loading the class - first
    static
    {
        System.out.println("Outer Static Block");
    }

    // Instance Initializer - Called itself when objct of this class is created
    {
        System.out.println("Outer Instance Intitializer");
    }

    // A non-static method can be called by other non-static methods of same class or by object of class outside the class
    void nonStaticMethod()
    {
        System.out.println("Print Non Static Method");
    }

    // A static method can be called inside other static and non-static methods, in other class using classname and objects both
    static void staticMethod()
    {
        System.out.println("Print Static Method");

    }

    static void displayStaticBlock()
    {
        // static block not allowed inside a method
//        static {
//            System.out.println("Inner static block");
//        }
        // Non-Static method are not visible to static method
//        nonStaticMethod();

        staticMethod();

        {
            System.out.println("Inner Instance Intitializer");
        }

        System.out.println("Inside function");

        System.out.println("before : " + staticVariable);

        staticVariable = 30;

        System.out.println("after : " + staticVariable);

        // non static variables are not visible to static variables
//        nonStaticVariable=100;
    }

    public static void main(String[] args)
    {
        displayStaticBlock();

        StaticBlockExecutionByJVM obj = new StaticBlockExecutionByJVM();

        obj.staticMethod();
    }
}
