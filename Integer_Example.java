public class Integer_Example {
    public static void main(String[] args){
        int decimal = 10;
        int hexaDecimal = 0x0a;
        int octal = 012;
        int binary=0b1010;

        int b1 = 0b100_0001;
        int b2 = 0b1000001;
        System.out.println(b1+" "+b2);
        System.out.println("Decimal="+decimal+"\nHexa="+hexaDecimal+"\noctal="+octal+"\nBinary="+binary);
    }
}
