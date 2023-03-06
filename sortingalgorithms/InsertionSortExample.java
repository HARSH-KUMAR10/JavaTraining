package date06032023.sortingalgorithms;

public class InsertionSortExample
{
    public static void main(String[] args)
    {
        int a[] = {5,10,8,3,6,1,2,9,7,4};
        System.out.println("Before Insertion sort: ");
        for(int x:a){
            System.out.print(x+", ");
        }
        int iterationCount = 0;
        for(int i=0;i<a.length;i++){
            int temp = a[i];
            int j = i-1;
            while(j>=0 && temp<=a[j]){
                iterationCount++;
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        System.out.println("\nAfter Insertion sort: ");
        for(int x:a){
            System.out.print(x+", ");
        }
        System.out.println("\nTotal iteration count: "+iterationCount);
    }
}
