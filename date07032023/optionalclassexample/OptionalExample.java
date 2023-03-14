package date07032023.optionalclassexample;

import java.util.Optional;

public class OptionalExample
{
    public static void main(String[] args)
    {
        try
        {
            String[] stringArray = new String[10];

            Optional<String> checkNullStringElement = Optional.ofNullable(stringArray[5]);

            if (checkNullStringElement.isPresent())
            {  // check for value is present or not
                String lowercaseStringElement = stringArray[5].toLowerCase();

                System.out.print(lowercaseStringElement);
            }
            else
                System.out.println("string value is not present");

            stringArray[5] = "JAVA OPTIONAL CLASS EXAMPLE";

            checkNullStringElement = Optional.ofNullable(stringArray[5]);

            if(checkNullStringElement.isPresent()){
                String lowercaseString = stringArray[5].toLowerCase();

                System.out.print(lowercaseString);
            }else
                System.out.println("String value is not present");

        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
