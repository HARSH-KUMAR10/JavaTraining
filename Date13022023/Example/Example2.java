package Date13022023.Example;

public class Example2 {
    static void swapInteger(Integer i, Integer j){
        Integer temp = new Integer(i);
        i=j;
        j=temp;
        System.out.println("(swap) i="+i+",j="+j);
    }
    static void swap(int i, int j){
        int temp = i;
        i=j;
        j=temp;
        System.out.println("(swap-int) i="+i+",j="+j);
    }
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer j = new Integer(20);
        swapInteger(i,j);
        System.out.println("(main)i="+i+",j="+j);
        swap(i,j);
        System.out.println("(main)i="+i+",j="+j);
    }
}
