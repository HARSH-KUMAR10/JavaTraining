package date17022023.stringBufferBuilder;

public class StringVarargs
{
    public static void main(String[] args)
    {
//        new StringVarargs().display("Hi",1);
//        new StringVarargs().display("Hi","Nilesh",1);
        new StringVarargs().display(1, "Hi");
        new StringVarargs().display(2, "Hi", "Nilesh");
    }

    //    public void display(String... s,int x){
    // Varargs arguments are only allowed at the last
    public void display(int x, String... s)
    {
        System.out.println(s[s.length - x]);
    }
}
