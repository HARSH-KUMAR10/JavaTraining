package date16032023.racecondition;

public class ReadModifyWriteExample
{
    int sharedVariable = 10;

     void changeVariable(int x){
        this.sharedVariable+=x;
    }

    public static void main(String[] args)
    {
        ReadModifyWriteExample readModifyWriteExample = new ReadModifyWriteExample();
        Thread thread = new Thread(()->{
            readModifyWriteExample.changeVariable(10);
            System.out.println(readModifyWriteExample.sharedVariable+" - should be 20");
        });
        Thread thread1 = new Thread(()->{
            readModifyWriteExample.changeVariable(15);
            System.out.println(readModifyWriteExample.sharedVariable+" - should be 35");
        });
        thread.start();
        thread1.start();
    }
}
