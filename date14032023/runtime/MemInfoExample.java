package date14032023.runtime;

public class MemInfoExample
{
    public static void main(String[] args)
    {
        System.out.println("Total processors: \t\t"+Runtime.getRuntime().availableProcessors());
        System.out.println("Free memory: \t\t"+Runtime.getRuntime().freeMemory());
        System.out.println("Used memory: \t\t"+(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory()));
        System.out.println("Total memory: \t\t"+Runtime.getRuntime().totalMemory());
        System.out.println("Max memory: \t\t"+Runtime.getRuntime().maxMemory());
    }
}
