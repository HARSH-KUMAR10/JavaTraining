package date17022023.methodInheritance;

class Parent
{
    void show()
    {
        System.out.println("this is " + this.getClass());
    }
}

public class ParentToChildObject extends Parent
{
    void show()
    {
        System.out.println("this is " + this.getClass());
    }

    public static void main(String[] args)
    {
        // Parent class show method has been overridden by show method of child class
        Parent parent = new ParentToChildObject();

        parent.show();
    }
}
