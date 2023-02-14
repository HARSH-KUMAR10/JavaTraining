package Date13022023.MapUpdateOnIterate;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class MapUpdateOnCondition {
    public static void main(String args[]){
        Map<Integer, List<Integer>> map = new ConcurrentHashMap<>();
        map.put(1,new ArrayList<>(Arrays.asList(1,2,3,4,5)));
        map.put(2,new ArrayList<>(Arrays.asList(3,4,5,6,7)));
        map.put(3,new ArrayList<>(Arrays.asList(5,6,7,8,9)));
        map.put(4,new ArrayList<>(Arrays.asList(8,9,10,11,12)));
        map.put(5,new ArrayList<>(Arrays.asList(4,3,2,1,0)));
        map.put(6,new ArrayList<>(Arrays.asList(1,2,3,4,5)));

        // Using streams
        // 1. taking out all the key-value from map
        Set<Integer> entry = map.keySet();
        entry.stream()
                .filter(item -> {
                    if (item % 2 == 0) {
                        entry.remove(item);
                    } else {
                        map.put(item, map.get(item)
                                .stream()
                                .filter(n -> n % 2 != 0)
                                .collect(Collectors.toList()));
            }
            return item % 2 != 0;
        }).collect(Collectors.toSet());
        System.out.println(map);
    }
}
