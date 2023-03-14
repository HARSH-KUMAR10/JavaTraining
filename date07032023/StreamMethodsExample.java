package date07032023;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMethodsExample
{
    public static void main(String[] args)
    {
        try
        {
            List<Integer> myList = List.of(10, 15, 13, 16, 19, 14, 17, 11, 18, 13, 16, 18, 12, 11, 10, 12, 17);

            List<Integer> myEvenList = List.of(2, 6, 4, 8);

            System.out.println(myList.stream().allMatch(item -> item % 2 == 0));

            System.out.println(myEvenList.stream().allMatch(item -> item % 2 == 0));

            System.out.println(myList.stream().anyMatch(item -> item % 2 != 0));

            System.out.println(myEvenList.stream().anyMatch(item -> item % 2 != 0));

            System.out.println(myList.stream().count());

            System.out.println("Distinct list elements: " + myList.stream().distinct().toList());

            Optional<Integer> firstOddNumber = myList.stream().filter(element -> element % 2 == 1).findFirst();

            if (firstOddNumber.isPresent())
            {
                System.out.println("First odd number is: " + firstOddNumber.get());
            }
            else
            {
                System.out.println("No odd element found");
            }

            Optional<Integer> firstOddNumber2 = myEvenList.stream().filter(element -> element % 2 == 1).findFirst();

            if (firstOddNumber2.isPresent())
            {
                System.out.println("First odd number is: " + firstOddNumber2.get());
            }
            else
            {
                System.out.println("No odd element found");
            }

            List<List<Integer>> mixList = List.of(myEvenList, myList);

            System.out.println(mixList);

            List<Integer> mergeList = mixList.stream().flatMap(element -> element.stream().distinct()).collect(Collectors.toList());

            System.out.println(mergeList);

            Optional<Integer> maxOfMergedList = (mergeList.stream().max(Integer::compareTo));

            System.out.println("Maximum element from list: " + (maxOfMergedList.isPresent()?maxOfMergedList.get():"not found"));

            Optional<Integer> minOfMergedList = mergeList.stream().min(Integer::compareTo);

            System.out.println("Minimum element from list: " + (minOfMergedList.isPresent()?minOfMergedList.get():"not found"));

            Object[] arrayOfList = mixList.stream().toArray();

            System.out.println(arrayOfList[0]);

            System.out.println(arrayOfList[1]);

            //System.out.println(arrayOfList[2]);

            System.out.println("Merged list: " + mergeList);

            List<Integer> reverseMixList = mergeList.stream().collect(Collectors.collectingAndThen(Collectors.toList(), l -> {
                Collections.reverse(l);
                return l;
            }));

            System.out.println("Reversed Merged List: "+reverseMixList);

        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }

    }
}
