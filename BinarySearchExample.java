package date06032023;

public class BinarySearchExample
{
    static int iterationCount = 0;
    static int binarySearch(int a[],int search,int start,int end){
        iterationCount++;
        int mid = (start+end)/2;
        if(a[mid]==search){
            return mid;
        }else if(a[mid]<search){
            return binarySearch(a, search, mid+1, end);
        }else{
            return binarySearch(a,search,start,mid-1);
        }
    }

    public static void main(String[] args)
    {
        int a[] = {2,5,7,9,11,15,17,19,20,22,25,27};
        int search = 19;
        System.out.println("index : "+binarySearch(a,search,0,a.length));
        System.out.println("Total elements : "+a.length+"\t\titerations : "+iterationCount);
    }
}
