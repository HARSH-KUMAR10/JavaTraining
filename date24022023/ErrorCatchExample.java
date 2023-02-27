package date24022023;

class RecursiveClass{
    int s = 0;
    void recursiveMethod(){
        s+=1;
        recursiveMethod();
    }
}

public class ErrorCatchExample
{
    static void show(){
        System.out.println("Print");
    }
    public static void main(String[] args)
    {
        RecursiveClass recursiveClass = new RecursiveClass();
        try {
            try{
                recursiveClass.recursiveMethod();
            }catch(StackOverflowError soe){
                System.out.println(recursiveClass.s);
                System.out.println("Error has been caught: "+soe);
                recursiveClass.recursiveMethod();
                recursiveClass.s=0;
            }catch(Error soe){
                System.out.println(recursiveClass.s);
                System.out.println("Error has been caught: "+soe);
                recursiveClass.recursiveMethod();
            }
        } catch (StackOverflowError e) {
            System.out.println(recursiveClass.s);
            System.out.println("Error has been caught: "+e);
//            recursiveClass.recursiveMethod();
        }
    }
}
