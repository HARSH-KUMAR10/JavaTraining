package date17022023.methodExecutionSequence;

public class StaticInstanceConstructor
{
    public StaticInstanceConstructor(){
        System.out.println("Constructor");
    }
    {
        System.out.println("Instance Initializer 3");
    }
    {
        System.out.println("Instance Initializer 1");
    }
    static{
        System.out.println("Static Initializer");
    }
    {
        System.out.println("Instance Initializer 2");
    }

    public static void main(String[] args)
    {
        // Sequence of execution - Static initializer block -> Instance initializer block -> constructor
        StaticInstanceConstructor staticInstanceConstructor = new StaticInstanceConstructor();
    }
}
