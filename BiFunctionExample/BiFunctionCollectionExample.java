package BiFunctionExample;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionCollectionExample {
    public static void main(String[] args){
        BiFunction<Integer, String, String> biFun = (x,y) -> "key: "+x+",value: "+y;
        Function<String, String> fun = (x) -> "["+x+"]\t";
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"ek");
        map.put(2,"do");
        map.put(3,"teen");
        map.put(4,"char");
        map.put(5,"panch");
        map.forEach((i,s)-> System.out.print(biFun.andThen(fun).apply(i,s)));
    }
}
