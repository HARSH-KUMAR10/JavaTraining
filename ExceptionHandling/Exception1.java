package ExceptionHandling;

import java.io.IOException;

public class Exception1 {
    public static void main(String[] args){
        try{
            int a=10;
            int b=20;
            int c = a+b;
            System.out.println(c);
        }finally {
            System.out.println("Execution complete");
        }

        try{
            int d = 100/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("Execution Completed!");
        }

        try{
            int e=10;
            int f=0;
            if(f==0){
                throw new IOException("Don't divide by 0");
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
