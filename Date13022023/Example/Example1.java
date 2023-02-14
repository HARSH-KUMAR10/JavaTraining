package Date13022023.Example;

import java.util.Arrays;

public class Example1 {
    int x;
    static int y;
    void fun(){
        int z;
        System.out.println(x);
        System.out.println(y);
//        System.out.println(z);
    }

    public static void main(String[] args) {
        Example1 e = new Example1();
        e.fun();
        int arr[] = {1,2,3};
        int arr1[] = {1,2,3};

        if(arr==arr1) System.out.println("Same");
        else System.out.println("Not Same");

        if(arr.equals(arr1)) System.out.println("Same");
        else System.out.println("Not Same");

        if(Arrays.equals(arr,arr1)) System.out.println("Same");
        else System.out.println("Not Same");
    }
}
