package StringExamples;

public class Example {
    static void concat1(String s){
        s+="some";
    }
    static void concat2(StringBuilder s){
        s.append("Some");
    }
    static void concat3(StringBuffer s){
        s.append("SOme");
    }
    public static void main(String[] args){
        String s1 = "glue";
        StringBuffer s2 = new StringBuffer("Glue");
        StringBuilder s3 = new StringBuilder("GLue");
        concat1(s1);
        concat2(s3);
        concat3(s2);
        System.out.println("String:"+s1);
        System.out.println("StringBuffer:"+s2);
        System.out.println("StringBuilder:"+s3);
        String str1 = "Harsh";
        String str2 = "Harsh";
        String str3 = new String("Harsh");
        String str4 = new String("Harsh");
        StringBuffer str5 = new StringBuffer("Harsh");
        StringBuffer str6 = new StringBuffer("Harsh");
        StringBuilder str7 = new StringBuilder("Harsh");
        StringBuilder str8 = new StringBuilder("Harsh");
        System.out.println("Checking normal strings: "+(str1==str2)+" & "+(str1.equals(str2)));
        System.out.println("Checking object strings: "+(str3==str4)+" & "+(str3.equals(str4)));
        System.out.println("Checking string-buffer: "+(str5==str6)+" & "+(str5.equals(str6)));
        System.out.println("Checking string-builder: "+(str7==str8)+" & "+(str7.equals(str8)));
    }
}
