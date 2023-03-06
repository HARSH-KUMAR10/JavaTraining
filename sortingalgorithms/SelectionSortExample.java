package date06032023.sortingalgorithms;

public class SelectionSortExample
{
    public static void main(String[] args)
    {
        int a[] = {5, 10, 8, 3, 6, 1, 2, 9, 7, 4};
        System.out.println("Before Selection sort: ");
        for (int x : a)
        {
            System.out.print(x + ", ");
        }
        int smallestindex = 0;
        int iterationCount = 0;
        while (smallestindex < a.length)
        {
            int tempSmallestIndex = 0;
            for (int i = smallestindex; i < a.length; i++)
            {
                iterationCount++;
                if (a[tempSmallestIndex] > a[i])
                {
                    tempSmallestIndex = i;
                }
            }
            int temp = a[smallestindex];
            a[smallestindex] = a[tempSmallestIndex];
            a[tempSmallestIndex] = temp;
            smallestindex++;

        }
        System.out.println("\nAfter Selection sort: ");
        for (int x : a)
        {
            System.out.print(x + ", ");
        }
        System.out.println("\nTotal iteration count: " + iterationCount);
    }
}
