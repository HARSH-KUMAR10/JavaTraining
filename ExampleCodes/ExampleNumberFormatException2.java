package Date14022023.ExampleCodes;

public class ExampleNumberFormatException2 {
    public static void main(String[] args) {
        String s = new String("invalid");
        try{
            Float f = new Float(s);
            System.out.println(f);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
