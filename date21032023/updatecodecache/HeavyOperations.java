package date21032023.updatecodecache;

public class HeavyOperations
{
    static private int number = 0;
    private static void increase(){
        number++;
    }
    public static int performOperation(){
        for(int i=0;i<100000000;i++){
            increase();
        }
        return number;
    }
}
