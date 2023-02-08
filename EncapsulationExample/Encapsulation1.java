package EncapsulationExample;

class One{
    static int b =20;
     void hello(){
         int a = 10;
        int c=b;
        System.out.println(a+":"+b+":"+c);
    }
}

public class Encapsulation1 {
    public static void main(String args[]){
        One one = new One();
        System.out.println(One.b);
        one.hello();
    }
}
