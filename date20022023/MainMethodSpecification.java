package date20022023;

class M{
    public void display() throws Exception{
        System.out.println("Parent");
    }
}
public class MainMethodSpecification extends M
{
//    public static void main(String[] args)
//    {
//        System.out.println("main");
//    }

    public void display() throws NumberFormatException{
        System.out.println("Child");
    }
    public static void main(String[] args) throws Exception
    {

        M m = new MainMethodSpecification();
        m.display();

//        System.out.println("Main method called");
//        return 1;
    }
}
