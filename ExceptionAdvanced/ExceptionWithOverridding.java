package Date15022023.ExceptionAdvanced;

import java.io.IOException;

class Parent{
    void msg(){
        System.out.println("Parent");
    }
    void msg2(){
        System.out.println("Parent2");
    }
}

public class ExceptionWithOverridding extends Parent {
//    void msg() throws IOException{
    void msg(){
        System.out.println("Child");
    }
    void msg2() throws RuntimeException{
        System.out.println("Child");
    }
    public static void main(String[] args) {
        Parent p = new ExceptionWithOverridding();
        p.msg();
        p.msg2();
    }
}
