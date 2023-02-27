package date20022023;

import java.text.ParseException;
import java.util.Date;

public class NumberFormatvsParseException
{
    public static void main(String[] args)
    {
        try{
//            Integer n = Integer.parseInt(new Date());
            Integer n = Integer.parseInt("invalid");
        }catch(NumberFormatException nfe){
            System.out.println(nfe);
        }
    }
}
