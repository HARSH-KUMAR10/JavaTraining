package VariableScope;

public class Scope1 {
    static int x = 10;
    static int operation(){
        return x+x;
    }
    public static void main(String[] args){
        Scope1 scope1 = new Scope1();
        System.out.println(scope1.operation());
    }
}
