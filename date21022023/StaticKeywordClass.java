package date21022023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StaticKeywordClass
{
    static int x = 100;

    String s = "Some String";

    static void show(){
        System.out.println("Show called");
    }

    void print(){
        System.out.println("Print called");
    }

    public static void main(String[] args)
    {
        StaticKeywordClass skc = new StaticKeywordClass();
        System.out.println(skc.x);
        skc.show();
        skc.print();
        System.out.println(skc.s);
        StaticKeywordClass skc1 = null;
        System.out.println(skc1.x);
        skc1.show();
//        skc1.print();
//        System.out.println(skc1.s);
//        Class.forName("date21022023.stringVariations.StringAndReference");

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int y = Integer.parseInt(br.readLine());
            System.out.println("int: "+y);
        }catch(IOException ioe){
            System.out.println(ioe);
        }
        try(Scanner sc = new Scanner(System.in)){
            int x = sc.nextInt();
            System.out.println("int: "+x);
        }
    }
}
