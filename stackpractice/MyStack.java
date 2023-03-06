package date06032023.stackpractice;

public class MyStack<E>
{
    static final int maxSizeOfStack = 10;
    int top = 0;
    private E stack[] = (E[]) new Object[maxSizeOfStack];
    void push(E e){
        if(top<=maxSizeOfStack-1){
            stack[top++] = e;
        }else{
            System.out.println("Stack Overflow");
        }
    }

    E pop(){
        if(top>0){
            return stack[--top];
        }else{
            System.out.println("Stack underflow");
            return null;
        }
    }

    E peek(){
        if(top>=0){
            return stack[top-1];
        }else{
            System.out.println("Stack Underflow");
            return null;
        }
    }
    int size(){
        return top;
    }
}
