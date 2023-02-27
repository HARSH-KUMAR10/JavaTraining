package date17022023.finalKeyword;

public class StaticFinalVariable
{
    static
    {
        System.out.println("Static Initializer Block");
        // We can't use the final variable until it is initialized
        // System.out.println("Final variable before assigning value in blank final variable : "+assignInStaticBlock);

        assignInStaticBlock = 20;
        // Cannot be updated once a value is assigned
        // updateInStaticBlock=20;
    }

    {
        System.out.println("Instance Initializer Block");

        System.out.println("Assigned value : " + (assignInStaticBlock + updateInStaticBlock));
    }

    // Will Show error unless updated in a static block
    static final int assignInStaticBlock;

    static final int updateInStaticBlock = 10;

    public static void main(String[] args)
    {
        System.out.println(assignInStaticBlock + updateInStaticBlock);

        StaticFinalVariable staticFinalVariable = new StaticFinalVariable();
    }
}
