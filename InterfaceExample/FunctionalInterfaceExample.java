package InterfaceExample;

interface Lambda1{
    void fun();
}
interface Lambda2<E,F>{
    int fun(E a,F b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args){
        Lambda1 lambda1 = () -> System.out.println("I am having fun");
        lambda1.fun();
        Lambda2<Integer,String> lambda2 = (i,s)->i+s.length();
        System.out.println(lambda2.fun(10,"Harsh"));
        System.out.println(lambda2.fun(20,"Harsh"));
        System.out.println(lambda2.fun(1,"Harsh"));

    }
}
