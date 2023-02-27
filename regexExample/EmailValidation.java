package date17022023.regexExample;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String email = null;
        while(true){
            System.out.print("Enter email address (q-quit): ");
            email = sc.nextLine();
            if(email.equals("q")){
                break;
            }
            System.out.println(Pattern.matches("([\\w][\\.])+([\\w][\\d])*@([\\w][.])+[\\w]",email)?"Email validated":"Unable to validate email");
        }
    }
}
