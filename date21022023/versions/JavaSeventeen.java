package date21022023.versions;

import java.util.List;
import java.util.Set;

record MyRecord(String name, int floor){
    private String getName(){
        return name;
    }
    private int getFloor(){
        return floor;
    }
    void printDetails(){
        System.out.println(getName()+" "+getFloor());
    }
}

public class JavaSeventeen
{
    // Multiline string - text block
    static void textBlockExample(){
        String textBlock = """
                {
                name:"Harsh Kumar",
                date:"21-02-2023",
                floor:2
                }""";
        System.out.println(textBlock);
    }
    // Switch expression
    static void switchExpressionExample(){
        String fruit = "tomato";
        switch(fruit){
            case "mango","banana" -> System.out.println("Yellow");
            case "apple","tomato" -> System.out.println("Red");
            case "strawberry" -> System.out.println("Pink");
            default -> System.out.println("Any");
        }
    }
    // Records
    static void recordExample(){
        MyRecord myRecord = new MyRecord("Harsh",2);
        MyRecord myRecord1 = new MyRecord("Sam",5);
        System.out.println(myRecord.name()+" "+myRecord.floor());
        myRecord.printDetails();
        System.out.println(myRecord1.name()+" "+myRecord1.floor());
        myRecord1.printDetails();
    }
    // Streams.toList()
    static void toListExample(){
        Set<Integer> set = Set.of(10,20,30,40,100);
        List<Integer> list = set.stream().toList();
        System.out.println("Set: "+set);
        System.out.println("List: "+list);
    }

    public static void main(String[] args)
    {
        textBlockExample();
        System.out.println("===============================");
        switchExpressionExample();
        System.out.println("===============================");
        recordExample();
        System.out.println("===============================");
        toListExample();
    }
}
