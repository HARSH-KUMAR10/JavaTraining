package date20022023;

import java.io.IOException;

class Parent{
    void print(){
        System.out.println(this.getClass()+" execute method called");
    }
}

public class Test1 extends Parent
{
//    void print() throws IOException{
    void print(){
        System.out.println(this.getClass()+" execute method called");
    }

    public static void main(String[] args)
    {
        Parent parent = new Test1();
        parent.print();
    }
}
