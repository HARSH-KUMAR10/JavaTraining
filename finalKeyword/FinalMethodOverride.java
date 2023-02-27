package date17022023.finalKeyword;

class FinalMethodParent
{
    final void print()
    {
        System.out.println("Parent-Print");
    }

    final void add(int a, int b)
    {
        System.out.println("Parent-Add:" + (a + b));
    }
    final void add(float a, float b){
        System.out.println("Parent-FloatAdd:"+(a+b));
    }

    final void mul(int c, int d)
    {
        System.out.println("Parent-Mul:" + (c * d));
    }
}

public class FinalMethodOverride extends FinalMethodParent
{
    // cannot override final method - print
//    void print(){
//        System.out.println("Child-Print");
//    }
    // Final method not overridden but overloaded
    void add(long l1, long l2)
    {
        System.out.println("Child-Add:" + (l1 + l2));
    }

    // Final method not overridden but overloaded
    void mul(float f1, float f2)
    {
        System.out.println("Child-Mul:" + (f1 * f2));
    }

    public static void main(String[] args)
    {
        System.out.println("Child reference - Child Object");
        // Child reference - Child Object assignment
        FinalMethodOverride finalMethodOverride = new FinalMethodOverride();
        finalMethodOverride.print();
        // below 2 methods are resolved at compile time to parent method as per signature
        finalMethodOverride.add(10, 20);
        finalMethodOverride.mul(11, 22);
        // below 4 methods are resolved at run time to Child methods as per signatur
        finalMethodOverride.add(10, 30l);
        finalMethodOverride.add(20l, 40);
        finalMethodOverride.mul(30f, 40);
        finalMethodOverride.mul(7, 10f);

        System.out.println("=======================================================");
        System.out.println("Parent reference - Parent Object");
        // Parent reference - Parent Object Assignment
        FinalMethodParent finalMethodParent = new FinalMethodParent();
        finalMethodParent.print();
        // below 2 methods are resolved at compile time to parent method
        finalMethodParent.add(10, 20);
        finalMethodParent.mul(11, 22);
        // below 4 methods are resolved at run time to Child methods
        // Not visible to parent object as not a child object
        // finalMethodParent.add(10, 30l);
        // finalMethodParent.add(20l, 40);
        // finalMethodParent.mul(30f, 40);
        // finalMethodParent.mul(7, 10f);

        System.out.println("=======================================================");
        System.out.println("Parent reference - Child Object");
        // Parent reference - Child Object Assignment
        FinalMethodParent finalMethodParent1 = new FinalMethodOverride();
        finalMethodParent.print();
        // below 2 methods are resolved at compile time to parent method
        finalMethodParent1.add(10, 20);
        finalMethodParent1.mul(11, 22);
        // below 4 methods are resolved at run time to Child methods
        // Not visible to parent reference
        // finalMethodParent1.add(10, 30l);
        // finalMethodParent1.add(20l, 40);
        // finalMethodParent1.mul(30f, 40);
        // finalMethodParent1.mul(7, 10f);

        System.out.println("=======================================================");
        System.out.println("Child reference - Parent Object");
        // Child reference - Parent Object Assignment - Can't put parent object directly to child reference
        // Can't cast from parent to child

        System.out.println("Trying to do something like Integer integer = (Integer) new Float(), Not allowed with objects");

        float floatFromInt = 20f;
        int intFromFloat = 30;
        float floatcastInt = intFromFloat;
        int intCastFloat = (int) floatFromInt;
        System.out.println("Casted float(implicit):"+floatcastInt+"\tCasted int(explicit):"+intCastFloat);

        // Wrapper object casting not allowed
        // Float floatObj = (Float)(new Integer(20));
        // Integer integerObj = (Integer)(new Float(20f));

        FinalMethodOverride finalMethodOverride1 = (FinalMethodOverride) (new FinalMethodParent());
        finalMethodOverride1.print();
        // below 2 methods are resolved at compile time to parent method
        finalMethodOverride1.add(10, 20);
        finalMethodOverride1.mul(11, 22);
        // below 4 methods are resolved at run time to Child methods
        // Not visible to casted parent object
        // finalMethodParent.add(10, 30l);
        // finalMethodParent.add(20l, 40);
        // finalMethodParent.mul(30f, 40);
        // finalMethodParent.mul(7, 10f);
    }
}
