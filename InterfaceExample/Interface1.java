package InterfaceExample;

interface Test1{
    int a = 10;
    static void fun1(){
        System.out.println("Function 1");
    }
}
interface Test2{
    static void fun1(){
        System.out.println("Function 2");
    }
    void fun2();
}

public class Interface1 implements Test1,Test2{

    public void fun2(){
        System.out.println("Function-2");
    }
    public static void main(String[] args){
        System.out.println(a);
        Test2.fun1();
        Test1.fun1();
        Interface1 int1 = new Interface1();
        int1.fun2();
        System.out.println(int1.a);
    }
}
