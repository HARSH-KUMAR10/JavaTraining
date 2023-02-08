package BiFunctionExample;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionAndThenExample {
    public static void main(String[] args){
        BiFunction<String, String, Boolean> bifun = (x,y)->x.equals(y);
        Function<Boolean,Boolean> fun = (c) -> !c;
        System.out.println(bifun.andThen(fun).apply("Motadata","motadata"));
        System.out.println(bifun.andThen(fun).apply("Motadata","Motadata"));
    }
}
