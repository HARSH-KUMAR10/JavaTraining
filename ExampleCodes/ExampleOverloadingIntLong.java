package Date14022023.ExampleCodes;

public class ExampleOverloadingIntLong {
    public void one(int a,long b){
        System.out.println("sum1:"+(a+b));
    }
    public void one(long a,int b){
        System.out.println("sum2:"+(a+b));
    }
    public void two(long a,long b){
        System.out.println("sum1:"+(a+b));
    }
    public void two(int a,int b){
        System.out.println("sum2:"+(a+b));
    }

    public static void main(String[] args) {
        ExampleOverloadingIntLong e = new ExampleOverloadingIntLong();
        e.two(10,10);
//        e.one(10,10);
    }
}
