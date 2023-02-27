package date24022023;

public class ErrorExceptionCatchExample
{
    public static void main(String[] args)
    {
        try{
            System.out.println("Going to throw error");
            throw new StackOverflowError("No more elements can be added to stack");
//            System.out.println("Unable to throw error");
            // Unreachable statement
        }catch(Exception e){
            System.out.println("Caught an exception");
            System.out.println(e);
        }catch (StackOverflowError err){
            System.out.println("Caught an error");
            System.out.println(err);
        }finally{
            System.out.println("Inside finally");
        }
        System.out.println("Out of try catch");
    }
}
