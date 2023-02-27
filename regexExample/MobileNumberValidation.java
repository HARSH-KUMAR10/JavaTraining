package date17022023.regexExample;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileNumberValidation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter phone number (q - quit) : ");
            String phone = sc.nextLine();
            if(phone.equals("q")){
                break;
            }
            System.out.println("Phone number validated : " +
                               ((Pattern.matches("(\\+91)?(\\s)*[6789](\\d{9})", phone)) ?
                                       "Valid Phone Number" : "Not a valid number (indian numbers allowed)"));
            System.out.println("========================================");
        }
    }
}
