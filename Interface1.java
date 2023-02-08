interface One{
    void first();
    static void second(){System.out.println("second");}
}

interface Two{
    void first();
    static void third(){System.out.println("third");}
}

class Three implements One,Two{
    @Override
    public void first() {
        System.out.println("first");
    }
}

public class Interface1 {
    public static void main(String[] args){
        Three three = new Three();
        three.first();
        One.second();
//        three.second();
    }

}
