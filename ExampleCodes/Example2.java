package Date14022023.ExampleCodes;

public class Example2 {
    public void execute(){
        try{int a = 10/0;}
//        System.out.println("test");
        catch (Exception e){System.out.println(e);}
        finally {System.out.println("error");}
    }

    public static void main(String[] args) {
        Example2 e =new Example2();
        e.execute();
    }
}
