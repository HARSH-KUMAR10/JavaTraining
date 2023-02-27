package date22022023;

class StaticClass{
    int abc = 20;
    static final int ABC = 1000;
    static final long DEF = Math.round(Math.random()*100);
    static {
        System.out.println("ABC: "+ABC+"\nDEF: "+DEF);
    }
    {
        System.out.println("Instance Initializer, abc: "+abc);
    }
}

public class StaticFieldsAndBlocks
{
    public static void main(String[] args)
    {
        System.out.println("Started");
        StaticClass staticClass;
        System.out.println("Reference created");
        staticClass = new StaticClass();
        System.out.println("Object created");
    }

}
