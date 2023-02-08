package HashMap;

import java.util.HashMap;

public class HashMap2 {
    public static void main(String args[]){
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(10,"Messi");
        map1.put(7,"Ronaldo");
        System.out.println("List: "+map1);
        System.out.println(map1.get(7).hashCode());
    }
}
