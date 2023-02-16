package date16022023.exception;

public class OverloadingWithWideningAndNarrowing
{

    public void add(long a, long b)
    {

        System.out.println("Long : " + (a + b));

    }

    public void addInt(int a, int b)
    {

        System.out.println("Int : " + (a + b));

    }

    public static void main(String[] args)
    {

        OverloadingWithWideningAndNarrowing object = new OverloadingWithWideningAndNarrowing();

        object.add(100, 200);   //Type Widening

//        mo2.addInt(100l,200l); //Type Narrowing not implicit

        object.addInt((int) 100l, (int) 200l);

    }

}
