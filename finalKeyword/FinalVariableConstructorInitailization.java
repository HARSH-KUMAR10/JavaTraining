package date17022023.finalKeyword;

public class FinalVariableConstructorInitailization
{
    final int assignValueInConstructor;

    final int updateValueInConstructor = 20;

    FinalVariableConstructorInitailization()
    {
        assignValueInConstructor = (int) (Math.random() * 100) + 20;

        // Only blank final variable can be initialized in constructor

        // updateValueInConstructor=30;
    }

    public static void main(String[] args)
    {
        FinalVariableConstructorInitailization finalVariableConstructorInitailization = new FinalVariableConstructorInitailization();

        System.out.println(finalVariableConstructorInitailization.updateValueInConstructor);

        System.out.println(finalVariableConstructorInitailization.assignValueInConstructor);

        // Cannot reassign value to final

        // finalVariableConstructorInitailization.updateValueInConstructor=100;

        // finalVariableConstructorInitailization.assignValueInConstructor=200;
    }

}
