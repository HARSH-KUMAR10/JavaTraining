package StreamsExample;

import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream2Example {
    public static void main(String[] args){
        LinkedList<String> arrStr = new LinkedList<>();
        arrStr.add("One");
        arrStr.add("Two");
        arrStr.add("Three");
        arrStr.add("Four");
        arrStr.add("Five");
        arrStr.add("Four");
        System.out.println(arrStr);
        Set<String> setArr = arrStr.stream().collect(Collectors.toSet());
        System.out.println(setArr);
    }
}
