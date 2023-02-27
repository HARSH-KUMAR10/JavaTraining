package date17022023.finalKeyword;

class FinalParameterOfParent<E>{
    void show(final E parentFinalParameter){
        System.out.println(parentFinalParameter);
    }
}


public class FinalParameterOfMethod
{
    void show(final int finalParameter){
        System.out.println(finalParameter);
        // can't assign a value to a final variable
        // finalParameter = 20;
    }
}
