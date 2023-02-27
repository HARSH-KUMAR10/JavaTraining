package date21022023.stringVariations;

import java.util.HashMap;

public class StringMutabilityWithMap
{
    static void stringLiteralMapping(){
        String s1 = "A";
        String s2 = "A";
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put(s1,"One");
        hashMap.put(s2,"Two");
        s1 = "B";
        System.out.println(hashMap);
        hashMap.put(s1,"Three");
        System.out.println(hashMap);
    }
    static void stringObjectMapping(){
        String s1 = new String("A");
        String s2 = new String("A");
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put(s1,"One");
        hashMap.put(s2,"Two");
        s1 = new String("B");
        System.out.println(hashMap);
        hashMap.put(s1,"Three");
        System.out.println(hashMap);
    }
    static void stringBufferMapping(){
        StringBuffer s1 = new StringBuffer("A");
        StringBuffer abc = s1;
        StringBuffer s2 = new StringBuffer("A");
        HashMap<StringBuffer,String> hashMap = new HashMap<>();
        hashMap.put(s2,"two");
        hashMap.put(s1,"One");
        s1 = new StringBuffer("B");
        System.out.println(hashMap);
        hashMap.put(s1,"Three");
        System.out.println(hashMap);
        System.out.println(hashMap.get(abc));
    }
    static void stringBuilderMapping(){
        StringBuilder s1 = new StringBuilder("A");
        StringBuilder s2 = new StringBuilder("A");
        HashMap<StringBuilder,String> hashMap = new HashMap<>();
        hashMap.put(s1,"One");
        hashMap.put(s2,"Two");
        s1 = new StringBuilder("B");
        System.out.println(hashMap);
        hashMap.put(s1,"Three");
        System.out.println(hashMap);
    }
    public static void main(String[] args)
    {
//        stringLiteralMapping();
        System.out.println("==========================");
//        stringObjectMapping();
        System.out.println("==========================");
        stringBufferMapping();
        System.out.println("==========================");
//        stringBuilderMapping();
    }

}
