package BiFunctionExample;

import java.util.function.BiFunction;

public class BiFunctionApplyExample {
    public static void main(String[] args){
        BiFunction<String,String,Integer> bifun = (x,y) -> x.length()+y.length();
        String s1 = "Harsh";
        String s2 = "Motadata";
        System.out.println("Total length of '"+s1+"' and '"+s2+"' is: "+bifun.apply(s1,s2));
    }
}
