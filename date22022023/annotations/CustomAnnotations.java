package date22022023.annotations;

import java.lang.reflect.Method;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface SpecialAnnotation{
    int score() default 100;
}

class TestAnnotation{
    @SpecialAnnotation(score=87)
     public void printScore(){
        System.out.println("Print the score");
    }
}

public class CustomAnnotations
{
    public static void main(String[] args)
    {
        TestAnnotation testAnnotation = new TestAnnotation();
        try
        {
            Method m = testAnnotation.getClass().getMethod("printScore");
            SpecialAnnotation specialAnnotation = m.getAnnotation(SpecialAnnotation.class);
            System.out.println(specialAnnotation.score());
        }catch (NoSuchMethodException nsme){
            System.out.println(nsme);
        }
    }
}
