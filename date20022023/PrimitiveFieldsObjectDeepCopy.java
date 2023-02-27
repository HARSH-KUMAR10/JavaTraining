package date20022023;

class PrimitiveClass extends Object{
    int a = 10;
    float b = 20f;
    long c = 12345;
    String s = "Hello";
    void print(){
        System.out.println("Int:"+a);
        System.out.println("Float:"+b);
        System.out.println("Long:"+c);
        System.out.println("String:"+s);
    }
}
public class PrimitiveFieldsObjectDeepCopy
{

    public static void main(String[] args)
    {
        PrimitiveClass primitiveObject = new PrimitiveClass();
        primitiveObject.print();
        System.out.println(100/0.0);
//        PrimitiveClass primitiveObject2 = Object.clone();
    }
}
