package Date13022023.Example;

class IntegerObject{
    int x;
    Integer y;
    void swap(){
        x=40;
        y=50;
    }
}

public class Example3 {
    static void swap(Integer s){
        s=20;
    }

    static void up(int x){
        x+=1;
    }

    public static void main(String[] args) {
        Integer s = 30;
        System.out.println("before : "+s);
        swap(s);
        System.out.println("after : "+ s);
        IntegerObject intObj = new IntegerObject();
        intObj.x = 20;
        intObj.y = 30;
        System.out.println("-----------------------------------\nbefore : x="+intObj.x+", y="+intObj.y);
        intObj.swap();
        System.out.println("after : x="+intObj.x+", y="+intObj.y);
        int arr[] = {1,2,3};
        System.out.println("-----------------------------------\nbefore : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        up(arr[2]);
        System.out.println("\nafter : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
