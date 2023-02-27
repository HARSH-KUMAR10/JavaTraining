package date22022023;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ReflectClass{
    private int a = 10;
    int b = 20;
    final int x = 45;
    private void sum(){
        a+=5;
    }
    void mul(){
        b*=20;
    }
}

public class ReflectionAPIExample
{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException
    {
        ReflectClass reflectClass = new ReflectClass();
        Method m = reflectClass.getClass().getMethod("sum");

        m.invoke(reflectClass);
    }
}
