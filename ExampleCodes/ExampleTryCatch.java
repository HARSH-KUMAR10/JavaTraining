package Date14022023.ExampleCodes;

public class ExampleTryCatch {
    public static void main(String[] args) {

        try{
            int a=10/0;
            System.out.println("second");
        }catch(ArithmeticException e){
            System.out.println(e);
        }

        try{
            int a=10/0;
            System.out.println("third");
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            int a=10/0;
            System.out.println("fourth");
        }catch(ArithmeticException e){
            System.out.println(e);
        }

        try{
            int a=10/0;
        }catch(Exception e){
            System.out.println(e);
        }

        // ArrayIndexOutOfBound exception handler for Arithmetic Exception
//        try{
//            int a=10/0;
//            System.out.println("fifth");
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }


        //Arithmetic Exception trying to handle by ArrayIndexOutOfBound Exception
//        try{
//            int a[]={2,3,4};
//            System.out.println("unchecked"+a[3]);
//        }catch(ArithmeticException e){
//            System.out.println(e);
//        }

        try{
            int a =10/0;
        }
        finally {
            System.out.println("final");
        }
    }
}
