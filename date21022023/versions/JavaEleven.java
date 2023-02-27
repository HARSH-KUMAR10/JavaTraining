package date21022023.versions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class MyVarClass{
//    var name;
    String name = "Var";
}

public class JavaEleven
{
    // Modularity
    // Choose release -release <no>
    // var keyword

    static void varExample(){
        var s = "Harsh";
        s="Kumar";
        var n = 20;
        var l = 1207298375023841l;
        var d = 18241f;
        var f =121.21;
        var d1 = 1029.1209;
        var c = '%';
        var b = true;
        var list = new ArrayList<>();
        list.add("A");
        list.add(10);
        var myVarClass = new MyVarClass();
//        System.out.println(n instanceof int);
        System.out.println(s+" "+((s.getClass().getSimpleName())));
        System.out.println(n+" "+(((Object) n).getClass().getSimpleName()));
        System.out.println(l+" "+(((Object)s).getClass().getSimpleName()));
        System.out.println(d+" "+(((Object)s).getClass().getSimpleName()));
        System.out.println(f+" "+(((Object)s).getClass().getSimpleName()));
        System.out.println(d1+" "+(((Object)s).getClass().getSimpleName()));
        System.out.println(c+" "+(((Object)s).getClass().getSimpleName()));
        System.out.println(b+" "+(((Object)s).getClass().getSimpleName()));
        System.out.println(list+" "+(list.getClass().getSimpleName()));
        System.out.println(myVarClass.name+" "+(myVarClass.getClass().getSimpleName()));
    }
    // version naming scheme changed
    // New String methods
    static void stringExample(){
        String s = "Test String";
        String s1 = "";
        String s2 = "Multiline1\nMultiline2\nMultiline3";
        String s3 = """
                MyLine 1
                MyLine 2
                MyLine 3
                """;
        System.out.println(s.isBlank()+" "+s1.isBlank());
        s2.lines().map(x->x+":").forEach(System.out::println);
        s3.lines().map(x->x+";").forEach(System.out::println);
        String s4 = (s+" ").repeat(3);
        System.out.println(s4);
        String[] s5 = s.split("[A-Z]");
        Iterator<String> ir = Arrays.stream(s5).iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
        }
    }
    public static void main(String[] args)
    {
        varExample();
//        stringExample();

    }
}
