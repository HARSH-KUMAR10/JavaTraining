package CloneableExample;

class Student implements Cloneable{
    int age;String name;
    Student(int a,String b){age=a;name=b;}
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    String print(){ return "Name: "+name+"\nAge: "+age;}
}

public class StudentCloneableExample {
    public static void main(String[] args){
        Student stu1 = new Student(20,"Harsh Kumar");
        try {
            Student stu2 = (Student) stu1.clone();
            System.out.println(stu1.print());
            System.out.println(stu2.print());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
