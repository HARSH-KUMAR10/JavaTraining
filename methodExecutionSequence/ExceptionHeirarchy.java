package date17022023.methodExecutionSequence;

public class ExceptionHeirarchy
{
    public void exception()
    {
        try
        {
            int[] numberArray = {1, 2, 3, 4, 5};
            // first left hand side is evaluated
            // In left we have array value resolution and then divide by 0
            // Array resolution generated ArrayIndexOutOfBound Exception
            // Arithmetic Exception is not generated as ArrayIndexOutOfBound is raised first
            int arrayElement = numberArray[numberArray.length] / 0;
            System.out.println(arrayElement);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        ExceptionHeirarchy exceptionHeirarchy = new ExceptionHeirarchy();
        exceptionHeirarchy.exception();
    }
}
