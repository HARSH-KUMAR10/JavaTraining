package date06032023.sortingalgorithms;

public class BubbleSortExample
{
    public static void main(String[] args)
    {
        int a[] = {5,10,8,3,6,1,2,9,7,4};
        System.out.println("Before bubble sort: ");
        for(int x:a){
            System.out.print(x+", ");
        }
        int iterationCount = 0;
        for(int j=0;j<a.length-1;j++){
            boolean swapped = false;
            for(int i=0;i<a.length-1;i++){
                iterationCount++;
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println("\nAfter bubble sort: ");
        for(int x:a){
            System.out.print(x+", ");
        }
        System.out.println("\nTotal iteration count: "+iterationCount);
    }
}
