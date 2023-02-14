package Date14022023.ExampleCodes;

public class ExampleNestedTry {
    public static void main(String[] args) {
        try{
            int a[] = {1,2,3,4};
            try{
                a[4] = a[a.length]/0;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            try{
                a[3] = 10/0;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
