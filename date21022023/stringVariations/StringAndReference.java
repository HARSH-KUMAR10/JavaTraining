package date21022023.stringVariations;

public class StringAndReference
{
    public static void main(String[] args)
    {
        String s1 = "Harsh";
        String s2 = "Harsh";
        String s3 = new String("Harsh");
        String s4 = new String("Harsh");
        StringBuffer s5 = new StringBuffer("Harsh");
        StringBuffer s5x = new StringBuffer("Harsh");
        StringBuilder s6 = new StringBuilder("Harsh");
        StringBuilder s6x = new StringBuilder("Harsh");
        System.out.println("String literal (s1): "+s1.hashCode());
        System.out.println("String literal (s2): "+s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println("String Object (s3): "+s3.hashCode());
        System.out.println("String Object (s4): "+s4.hashCode());

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println("String Buffer (s5): "+s5.hashCode());
        System.out.println("String Buffer (s5x): "+s5x.hashCode());
        System.out.println(s5==s5x);
        System.out.println(s5.equals(s5x));
        System.out.println("String Builder (s6): "+s6.hashCode());
        System.out.println("String Builder (s6x): "+s6x.hashCode());
        System.out.println(s6==s6x);
        System.out.println(s6.equals(s6x));
        s1 = "heelo";
        s2 = "hello";
        System.out.println("String literal (s1): "+s1.hashCode());
        System.out.println("String literal (s2): "+s2.hashCode());
        s3 = "heelo";
        s4 = new String("hello");
        System.out.println("String literal (s1): "+s1.hashCode());
        System.out.println("String literal (s2): "+s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println("String Builder (s6): "+s6.hashCode());
        System.out.println("String Builder (s6x): "+s6x.hashCode());
        System.out.println(s6==s6x);
        System.out.println(s6.equals(s6x));
    }
}
