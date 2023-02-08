package SetExample;


import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Monday");
        set.add("Tuesday");
        set.add("Wednesday");
        set.add("Thursday");
        set.add("Friday");
        set.add("Saturday");
        set.add("Sunday");
        System.out.println("Set: "+set);
        set.remove("Thursday");
        set.remove("Saturday");
        set.remove("NoDay");
        System.out.println("Set: "+set);
    }
}
