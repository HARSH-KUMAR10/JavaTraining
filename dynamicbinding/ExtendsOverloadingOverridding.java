package date16022023.dynamicbinding;

class ParentClass{
    void show(int x,float y){
        System.out.println(x+" = x -- y = "+y);
    }
    void print(int a, float b){
        System.out.println(a+" = a -- b = "+b);
    }
}
class ChildClass extends ParentClass{
    void show(float x, int y){
        System.out.println(y+" = y -- x = "+x);
    }
    void print(int a, float b){
        System.out.println(b+" = b -- a = "+a);
    }
}

public class ExtendsOverloadingOverridding
{
    public static void main(String[] args)
    {
        ChildClass childClass = new ChildClass();
        childClass.print(10,20);
        childClass.show(10,10f);
        childClass.show(10f,10);
    }
}
