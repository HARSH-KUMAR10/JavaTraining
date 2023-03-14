package date14032023.runtime;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VMStatExample
{
    public static void main(String[] args)
    {
        try
        {
            Process process = Runtime.getRuntime().exec("vmstat");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String  str;
            while((str=bufferedReader.readLine())!=null){
                System.out.println(str);
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
