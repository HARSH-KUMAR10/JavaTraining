package date14032023.synchronization;

public class SynchronizedTaskExample
{
    static synchronized void synchronizedTable(int x){
        try{
            for(int i=0;i<10;i++){
                System.out.println(x+" x "+(i+1)+" = "+ (x*(i+1)));
                Thread.sleep(100);
            }
        }catch(Exception exception){
            System.out.println(exception);
        }
    }

    public static void main(String[] args)
    {
        Thread thread = new Thread(()->{
            synchronizedTable(10);
        });
        Thread thread1 = new Thread(()->{
            synchronizedTable(7);
        });
        thread.start();
        thread1.start();
    }
}
