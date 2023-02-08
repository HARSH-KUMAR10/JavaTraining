package AbstractionExample;

abstract class ABS1{
    int a=10;
    static int b=20;
    static {System.out.println("Abstract: Static Initializer");}
    abstract void aFor();
    abstract void bFor();
    void cFor(){
        System.out.println(a+" "+b);
        System.out.println("C for cat.");
    }
    ABS1(int x){
        a=x;
    }
}

class Teach extends ABS1{
    static{System.out.println("Teach: static Initializer");}
    void aFor(){
        System.out.println(ABS1.b);
        System.out.println("A for Apple");
    }
    void bFor(){
        System.out.println("B for Ball");
    }
    Teach(int x){
        super(x);
    }
}
public class Abstraction1 {
    public static void main(String[] args){
        Teach teach = new Teach(30);
        teach.aFor();
        teach.bFor();
        teach.cFor();
        System.out.println(teach.a+teach.b);
    }
}
