package date17022023.finalKeyword;

final class FinalClassParent
{
    int instanceVariable = 20;

    static int staticVariable = 30;

    final int finalInstanceVariable = 40;

    final static int finalStaticVariable = 50;

    void instanceMethod()
    {
        System.out.println("This is instance method");
    }

    static void staticMethod()
    {
        System.out.println("This is static method");
    }

    final void finalInstanceMethod()
    {
        System.out.println("This is final instance method");
    }

    final static void finalStaticMethod()
    {
        System.out.println("This is final static method");
    }
}

// Final Class can't be inherited
// public class FinalClassScope extends FinalClassParent
public class FinalClassScope
{
    public static void main(String[] args)
    {
        FinalClassParent.staticMethod();

        FinalClassParent.finalStaticMethod();

        System.out.println("this is static variable: " + FinalClassParent.staticVariable);

        System.out.println("this is final static variable: " + FinalClassParent.finalStaticVariable);

        FinalClassParent finalClassParent = new FinalClassParent();

        finalClassParent.instanceMethod();

        finalClassParent.finalInstanceMethod();

        System.out.println("this is instance variable: " + finalClassParent.instanceVariable);

        System.out.println("this is final instance variable: " + finalClassParent.finalInstanceVariable);
    }
}
