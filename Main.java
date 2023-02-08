import java.util.Scanner;

class OneClass{
    private static int one(){
        return 5;
    }
    static void two(){
        System.out.println(one());
    }
    void three(){
        System.out.println(one());
    }
    int four(){
        return 4;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println("Entered text is :"+x);

        System.out.println(0.1+0.2);
        System.out.println(1-0.9);
        OneClass oneClass = new OneClass();
        OneClass.two();
    }
}
