package date17022023.methodInheritance;

class ExceptionParent
{
    void print() throws Exception
    {
        System.out.println("This is " + this.getClass());
    }
}

public class ExceptionTracingWithOverridding extends ExceptionParent
{
    void print() throws NumberFormatException
    {
        System.out.println("This is " + this.getClass());
    }

    public static void main(String[] args)
    {
        // By reference of variable we can say that exceptionParent will throw Exception in print
        // while at runtime the method is overridden and now it throws NumberFormatException

        ExceptionParent exceptionParent = new ExceptionTracingWithOverridding();

        // thrown exception and handled
//        exceptionParent.print();
    }
}
