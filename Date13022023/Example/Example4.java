package Date13022023.Example;

public class Example4 {
    public void one(){
        try{
            two();
            System.out.println("one try block");
        }catch(Exception e){
            System.out.println("exception");
        }
    }
    private void two(){three();System.out.println("two");}
    private void three(){four();System.out.println("three");}
    private void four(){
        int a = 10/0;
        System.out.println("four");
    }
    public static void main(String[] args) {
        Example4 a = new Example4();a.one();
    }
}
