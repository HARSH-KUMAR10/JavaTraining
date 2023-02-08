package SerializableExample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable {
    String name;
    int age;
    Student(String a, int b){
        name=a;
        age=b;
    }
    void print(){
        System.out.println("Name: "+name+"\nAge: "+age);
    }
}

public class InputStreamExample {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("fis.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student stu = (Student)ois.readObject();
            Student stu2 = (Student)ois.readObject();
            stu.print();
            stu2.print();
            ois.close();
        }catch(Exception ioe){
            System.out.println(ioe);
        }

    }
}
