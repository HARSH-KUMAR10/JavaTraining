package date17022023.methodInheritance;

public class MultiOverriddingMethod
{
    public String print()
    {
        return "print-1";
    }

    public static void main(String[] args)
    {
        //print method of class 5 has overridden print method of Main class
        MultiOverriddingMethod multiOverriddingMethod = new OverrideClassFour();

        System.out.println(multiOverriddingMethod.print());
    }
}

class OverrideClassOne extends MultiOverriddingMethod
{
    public String print()
    {
        return "print-2";
    }
}

class OverrideClassTwo extends MultiOverriddingMethod
{
    @Override
    public String print()
    {
        return "print-3";
    }
}

class OverrideClassThree extends MultiOverriddingMethod
{
    public String print()
    {
        return "print-4";
    }
}

class OverrideClassFour extends MultiOverriddingMethod
{
    public String print()
    {
        return "print-5";
    }
}
