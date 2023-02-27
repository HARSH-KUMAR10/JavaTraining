package date20022023;

import java.util.ArrayList;

public class ArrayListShallowCopy
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("==============================");
        arrayList.add("One");
        System.out.println(arrayList.hashCode());
        arrayList.add("Four");
        System.out.println(arrayList.hashCode());
        arrayList.add("Two");
        System.out.println(arrayList.hashCode());
        arrayList.add("Three");
        System.out.println(arrayList.hashCode());
        System.out.println("==============================");

        System.out.println(arrayList);
        System.out.println(arrayList.hashCode());
        ArrayList<String> arrayList1 =(ArrayList<String>) arrayList.clone();
        System.out.println(arrayList1);
        System.out.println(arrayList1.hashCode());
        arrayList1.set(1,"Five");
        ArrayList<String> arrayList2 = (ArrayList<String>) arrayList1.clone();
        System.out.println("==============================");
        System.out.println(arrayList);
        System.out.println(arrayList.hashCode());
        System.out.println(arrayList1);
        System.out.println(arrayList1.hashCode());
        System.out.println(arrayList2);
        System.out.println(arrayList2.hashCode());
    }
}
