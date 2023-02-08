package LambdaExpressionExample;
interface LambdaOne{ void fun1(Integer i);}
interface LambdaTwo{ int fun1(Integer i);}
public class LambdaExample1 {
    public static void main(String[] args){
        LambdaOne obj1 = (i)->{System.out.println(i+100);};
        LambdaOne obj2 = (i)->{System.out.println(i*100);};
        LambdaTwo obj3 = (i)->{
            return (i-10);
        };
        System.out.println(obj1.getClass());
        obj1.fun1(100);obj2.fun1(35);
        System.out.println(obj3.fun1(45));
    }
}
