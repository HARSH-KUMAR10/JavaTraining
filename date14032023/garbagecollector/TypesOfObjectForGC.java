package date14032023.garbagecollector;

public class TypesOfObjectForGC
{
    public void finalize()
    {
        System.out.println("Current thread: " + Thread.currentThread().getName() +
                           "\nThread group: " + Thread.currentThread().getThreadGroup());
    }

    public static void main(String[] args)
    {
        try
        {
            TypesOfObjectForGC typesOfObjectForGC = new TypesOfObjectForGC();
            TypesOfObjectForGC typesOfObjectForGC1 = new TypesOfObjectForGC();
            typesOfObjectForGC1 = typesOfObjectForGC;
            typesOfObjectForGC1 = null;
            new TypesOfObjectForGC();
            System.out.println("Starting GC ...");
            Runtime.getRuntime().gc();
            System.gc();
            System.out.println("Ended GC ...");
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
