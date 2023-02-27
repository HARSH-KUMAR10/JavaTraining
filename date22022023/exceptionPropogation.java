package date22022023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class A{
    void show() throws IOException{
        System.out.println("IO");
    }
}

class B extends A{
    void show() throws ArithmeticException{
        System.out.println("Arithmetic");
    }
}

public class exceptionPropogation
{
    public static void main(String[] args)
    {
        System.out.println("Scanner vs Buffer");
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Scanner");
            int s = sc.nextInt();
//            sc.nextLine();
        }
        System.out.println("Scanner Complete");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int b = Integer.parseInt(br.readLine());
        }catch(IOException ioe){
            System.out.println(ioe);
        }
        System.out.println("Buffered Reader");
    }
}
