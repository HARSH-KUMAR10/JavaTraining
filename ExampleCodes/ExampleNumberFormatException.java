package Date14022023.ExampleCodes;

public class ExampleNumberFormatException {
    public static void main(String[] args) {
        String s = new String("invalid");
        try{
            Float f = Float.parseFloat(s);
            System.out.println(f);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
