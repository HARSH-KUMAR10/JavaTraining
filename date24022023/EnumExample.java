package date24022023;



public class EnumExample
{
    enum Colors {
        Red(1),Blue(2),Green(3);

        int value;
        Colors(int t){
            this.value=t;
        }
        void showAll() {
            value*=10;
        }
    }
    enum Days {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};

    public static void main(String[] args)
    {
        for(Days d: Days.values()){
            System.out.println(d);
        }

        for(Colors c:Colors.values()){
            c.showAll();
            System.out.println(c+" "+c.value);
        }
    }
}
