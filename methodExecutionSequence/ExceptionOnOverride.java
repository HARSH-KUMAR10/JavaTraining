package date17022023.methodExecutionSequence;

class ExceptionParent{
//    void print() throws Exception{
    // runtime compilation error
    void print(){
        System.out.println("this is "+this.getClass());
    }
}

public class ExceptionOnOverride extends ExceptionParent
{
    void print() throws NumberFormatException{
        System.out.println("This is "+this.getClass());
    }

    public static void main(String[] args)
    {
        ExceptionParent exceptionParent = new ExceptionOnOverride();
        exceptionParent.print();
    }
}
