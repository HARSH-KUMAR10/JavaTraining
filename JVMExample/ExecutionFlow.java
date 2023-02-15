package Date15022023.JVMExample;

class ClassExecutionFlow{
    static {
        System.out.println("Out Class : static initializer");
    }
    {
        System.out.println("Out Class : instance initializer");
    }
    ClassExecutionFlow(){
        System.out.println("Out Class : Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Out Class : In main");
    }
}

public class ExecutionFlow {
    static {
        System.out.println("static initializer");
    }
    {
        System.out.println("instance initializer");
    }
    ExecutionFlow(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("In main");
        ExecutionFlow ef = new ExecutionFlow();
        ClassExecutionFlow cef = new ClassExecutionFlow();
        ClassExecutionFlow.main(args);
    }
}
