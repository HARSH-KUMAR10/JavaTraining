package date16022023.exception;

public class OverloadingWithVariableCasting
{
    public void add(long a, long b)
    {
        System.out.println("Long : ");
        System.out.println(a + b);
    }

    public void add(int a, int b)
    {
        System.out.println("Int : ");
        System.out.println(a + b);
    }

    public static void main(String[] args)
    {
        OverloadingWithVariableCasting overloadingWithVariableCasting = new OverloadingWithVariableCasting();
        overloadingWithVariableCasting.add(100, 200);
        overloadingWithVariableCasting.add(250l, 200);
        overloadingWithVariableCasting.add(200, 10l);
        overloadingWithVariableCasting.add(10l, 20l);
    }
}
