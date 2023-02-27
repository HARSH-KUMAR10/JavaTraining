package date21022023.specialKeyword;

import java.io.*;


public class TransientKeyword implements Serializable
{
    String s = "Some String";
    transient String s1 = "Transient String";
    int num = (int) Math.round(Math.random()*100);
    transient int num1 =  (int) Math.round(Math.random()*100);
    float f = 20.4f;
    transient float f1 = 30.2f;
    boolean b = false;
    transient boolean b1 = true;

    void showAll(){
        System.out.println("String: "+s);
        System.out.println("Transient String: "+s1);
        System.out.println("Random int: "+num);
        System.out.println("Transient random int: "+num1);
        System.out.println("float: "+f);
        System.out.println("transient float: "+f1);
        System.out.println("boolean: "+b);
        System.out.println("transient boolean: "+b1);
    }
    public static void main(String[] args) throws Exception
    {
        // Serialization
        TransientKeyword myObject = new TransientKeyword();
        myObject.showAll();
        FileOutputStream fos = new FileOutputStream("MyObject.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(myObject);

        System.out.println("============================================");

        //Deserialization
        FileInputStream fis = new FileInputStream("MyObject.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TransientKeyword myObject1 = (TransientKeyword) ois.readObject();
        myObject1.showAll();
    }
}
