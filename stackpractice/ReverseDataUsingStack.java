package date06032023.stackpractice;

import java.util.Arrays;

public class ReverseDataUsingStack
{
    public static void main(String[] args)
    {
        int data[] = {20,40,60,80};
        MyStack<Integer> myStack = new MyStack();
        for(int i=0;i<data.length;i++){
            myStack.push(data[i]);
        }
        System.out.print("Original: [");
        for(var x:data){
            System.out.print(x+", ");
        }
        System.out.print("]\nReverse: [");
        while(true){
            var x = myStack.pop();
            if(x==null){
                break;
            }else{
                System.out.print(x+", ");
            }
        }
        System.out.println("]");
    }
}
