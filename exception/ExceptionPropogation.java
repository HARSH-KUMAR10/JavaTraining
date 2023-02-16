package date16022023.exception;

public class ExceptionPropogation
{
    public void execute()
    {
        try
        {
            execute1();
            System.out.println("Execute method");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }

    private void execute1()
    {
        execute2();
        System.out.println("Execute 1 method");
    }

    private void execute2()
    {
        execute3();
        System.out.println("Execute 3 method");
    }

    private void execute3()
    {
        int a = 10 / 0;
        System.out.println("Execute 2 method");
    }

    public static void main(String[] args)
    {
        ExceptionPropogation ep = new ExceptionPropogation();
        ep.execute();
    }
}
