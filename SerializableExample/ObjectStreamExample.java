package SerializableExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamExample {
    public static void main(String[] args){
        try{
            Student s1 = new Student("Harsh Kumar",20);
            Student s2 = new Student("Lionel Messi",36);
            FileOutputStream fos=new FileOutputStream("fis.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
