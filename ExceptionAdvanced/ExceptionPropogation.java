package Date15022023.ExceptionAdvanced;

class PropogateException{
    void m(){
        int n=10/0;
    }
    void n(){
        m();
    }
    void o(){
        try{
            n();
            System.out.println("Below n");
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}

public class ExceptionPropogation {
    public static void main(String[] args) {
        PropogateException exce = new PropogateException();
        exce.o();
    }
}
