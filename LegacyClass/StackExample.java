package LegacyClass;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.search(30));
        System.out.println(stack);
    }
}
