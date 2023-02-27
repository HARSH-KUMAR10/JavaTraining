package date17022023.stringBufferBuilder;

public class StringEqualsExample
{
    public static void main(String[] args)
    {
        String s1 = new String("Test");

        String s2 = new String("Test");

        System.out.println(s1.equals(s2));

        System.out.println(s1 == s2);

        StringBuilder sb = new StringBuilder("Test");

        StringBuilder sb1 = new StringBuilder("Test");

        System.out.println(sb.equals(sb1));

        System.out.println(sb == sb1);

        StringBuffer sbu = new StringBuffer("Test");

        StringBuffer sbu1 = new StringBuffer("Test");

        System.out.println(sbu.equals(sbu1));

        System.out.println(sbu == sbu1);
    }
}
