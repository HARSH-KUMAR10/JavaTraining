package date07032023.setpractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MySetOperations
{
    public static void main(String[] args)
    {
        Set<Integer> setOne = new HashSet<>(Set.of(2, 6, 1, 9, 5, 10, 15, 13, 4, 3, 7, 14, 11, 12, 17, 16));

        System.out.println("Set One : " + setOne);

        Set<Integer> setTwo = Set.of(11, 18, 20, 25, 27, 22, 19, 13, 15, 12, 16, 14);

        System.out.println("Set Two : " + setTwo);

        System.out.println(setOne.add(5));

        System.out.println(setOne.add(8));
    }
}
