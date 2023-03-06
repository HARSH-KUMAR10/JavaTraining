package date06032023;

import java.util.ArrayList;
import java.util.List;

public class TwoPointerExample
{

    static ArrayList<List<Integer>> returnObj = new ArrayList<>();
    static ArrayList<List<Integer>> twoPointer(int a[], int search, int start, int end)
    {
        if (start > end)
        {
            return returnObj;
        }
        else
        {
            int operation = a[start] * a[end];
            if (operation == search)
            {
                returnObj.add(List.of(a[start], a[end]));
                return twoPointer(a, search, start + 1, end - 1);
            }
            else if (operation > search)
            {
                return twoPointer(a, search, start, end - 1);
            }
            else
            {
                return twoPointer(a, search, start + 1, end);
            }
        }
    }

    public static void main(String[] args)
    {
        int a[] = {1, 4, 5, 7,8, 9, 10, 12, 13, 15, 16, 17, 18, 20, 22, 23, 24};
        int search = 80;
        ArrayList<List<Integer>> combinations = twoPointer(a, search, 0, a.length - 1);
        combinations.stream().forEach(System.out::println);
    }

}
