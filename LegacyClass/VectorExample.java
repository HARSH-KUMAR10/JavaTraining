package LegacyClass;

import java.util.Vector;
import java.util.Enumeration;

public class VectorExample {
    public static void main(String[] args)
    {
        Vector<String> vec = new Vector<String>();
        vec.add("First");
        vec.add("Second");
        vec.add("Third");
        vec.add("Fourth");
        vec.add("Fifth");
        vec.add("Sixth");
        Enumeration<String> data = vec.elements();
        while(data.hasMoreElements())
        {
            System.out.print(data.nextElement()+", ");
        }
    }
}
