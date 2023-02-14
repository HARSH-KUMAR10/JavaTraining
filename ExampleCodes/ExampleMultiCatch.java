package Date14022023.ExampleCodes;

public class ExampleMultiCatch {
    public static void main(String[] args) {

        try{
            int a = 10/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
//        catch(ArithmeticException e){
//            System.out.println(e);
//        }
        catch(Exception e){
            System.out.println(e);
        }

        int a[] = {12,3,4};
        try{
            System.out.println(a[3]);
        }catch(Exception e){
            System.out.println(e);
        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
    }
}
