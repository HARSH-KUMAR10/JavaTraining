package date16022023.dynamicbinding;

class Parent
{
    void show()
    {
        System.out.println("parent-show");
    }

    void parent()
    {
        System.out.println("Parent");
    }
}

class Child extends Parent
{
    void child()
    {
        System.out.println("Child");
    }

    void show()
    {
        System.out.println("child-show");
    }

}

public class EarlyBindingLateBinding
{
    public static void main(String[] args)
    {
        Parent parentObj = new Parent(); // Static (Compile time) binding

        parentObj.parent();

        parentObj.show();

        System.out.println("===================================================");

        Parent parentObj1 = new Child(); // Dynamic (Runtime) binding

        parentObj1.parent();

        parentObj1.show();

        System.out.println("===================================================");

        Child childObj = new Child(); // Static (Compile time) binding

        childObj.child();

        childObj.show();

        childObj.parent();

        System.out.println("===================================================");

        Child childObj1 = (Child) parentObj1;

        childObj1.child();

        childObj1.show();

        System.out.println("===================================================");
    }
}
