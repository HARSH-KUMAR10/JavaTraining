class Test{
    static int count=0; //Static Class Variable
    int id=0; // Instance Object Variable
    Test(int x){
        count++;
        id=x;
    }
    void show(){
        int local = 7; // Local Block Variable
        System.out.println("id="+id+"\ncount="+count+"\nlocal="+local);
    }
}

public class VariableTypes {
    public static void main(String args[]){
        Test test1 = new Test(1001);
        test1.show();
        Test test2 = new Test(1002);
        Test test3 = new Test(1003);
        test2.show();
        test3.show();
        Test test4 = new Test(1004);
        test4.show();

    }
}
