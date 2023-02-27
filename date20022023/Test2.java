package date20022023;


public class Test2
{
    public void print(){
        try{
            print1();
            System.out.println("execute");
        }catch(Exception e){
            System.out.println("catch");
        }
    }
    private void print1(){
        print2();
        System.out.println("execute 2");
    }
    private void print2(){
        print3();
        System.out.println("execute 3");
    }
    private void print3(){
        int c = 10/0;
        System.out.println("execute 4");
    }

    public static void main(String[] args)
    {
        Test2 test2 = new Test2();
        test2.print();
    }
}
