package date20022023;

class InheritanceParent{
    public void one(){
        System.out.println("one");
    }
    protected void two(){
        System.out.println("two");
    }
    void three(){
        System.out.println("three");
    }
    private void four(){
        System.out.println("four");
    }
}

class InheritanceChild extends InheritanceParent{
    // Only public allowed, all others are weaker access
     public void one(){
        System.out.println("Child-One");
    }
    // stronger access are allowed like - public and protected(same), weaker access are not allowed like default and private
    public void two(){
        System.out.println("Child-Two");
    }
    // Stronger access allowed: public, protected, default. No weaker access: private
    public void three(){
        System.out.println("Child-Three");
    }
    public void four(){
        System.out.println("Child-Four");
    }
}

public class AccessModifiersWithInheritance
{
    public static void main(String[] args)
    {
        InheritanceChild inheritanceChild = new InheritanceChild();
        inheritanceChild.one();
        inheritanceChild.two();
        inheritanceChild.three();
        inheritanceChild.four();
    }
}
