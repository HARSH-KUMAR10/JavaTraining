package InterfaceExample;

interface I{
    int num = 10;
    void fun();
    static int A(){return 10;}
    default String B(){return "Interface I";}
}
interface J{
    int num=20;
    void fun();
    static int A(){return 20;}
//    default String B(){return "Interface J";}
}

public class Interface2 implements I,J{
    public void fun(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
        Interface2 it2 = new Interface2();
        it2.fun();
        System.out.println(it2.B());
//        it2.A();
        System.out.println(I.A());
        System.out.println(J.A());
    }
}
