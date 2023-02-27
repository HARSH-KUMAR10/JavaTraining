package date17022023.methodExecutionSequence;

public class ParseException
{
    public static void main(String[] args)
    {
        parse("invalid");
    }
    private static void parse(String s){
        try{
            Float var = Float.parseFloat(s);
            System.out.println("Float: "+var);
        }catch(NumberFormatException e){
            System.out.println(e);
            // Will not be able to resolve local variables of try block
//            var =0;
        }
        finally
        {
//            System.out.println(var);
        }
    }
}
