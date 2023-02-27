package date17022023.methodInheritance;

class OverridingParent{
    public void program(int x){
        System.out.println("Program "+x);
    }
}

public class OverridingWithNarrowingAndWidening extends OverridingParent
{
    public void program(int y){
        System.out.println("SubProgram "+y);
    }
    public void program(String s){
        System.out.println("String sub-program "+s);
    }

    public static void main(String[] args)
    {
        OverridingParent overridingParent = new OverridingParent();
        OverridingParent overridingParent1 = new OverridingWithNarrowingAndWidening();
        overridingParent.program(11);
        overridingParent1.program(12);
    }
}
