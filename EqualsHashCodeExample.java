package date06032023;

public class EqualsHashCodeExample
{
    public static void main(String[] args)
    {
        String s1 = new String("Test");
        String s2 = new String("Test");
        System.out.println(s1.hashCode()+" = "+s2.hashCode());
        System.out.println(s1.equals(s2));

    }
}
