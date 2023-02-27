package date21022023.specialKeyword;

class VolatileClass{
    static volatile boolean flag = true;

    static boolean flag1 = true;
    void achieveAsynchronization(){
        System.out.println("------------------------------------------");
        System.out.println(Thread.currentThread().getName());
        if(flag1){
            System.out.println("Running: "+Thread.currentThread().getName());
            flag1 = false;
        }else{
            System.out.println("Thread Sleeps");
            try
            {
                Thread.sleep(5000);
                flag1 = true;
                achieveAsynchronization();
            }catch(InterruptedException ie)
            {
                System.out.println(ie);
            }
        }
    }
    void achieveSynchronization(){
        System.out.println("------------------------------------------");
        System.out.println(Thread.currentThread().getName());
        if(flag){
            System.out.println("Running: "+Thread.currentThread().getName());
            flag = false;
        }else{
            System.out.println("Thread Sleeps");
            try
            {
                Thread.sleep(5000);
                flag = true;
                achieveSynchronization();
            }catch(InterruptedException ie)
            {
                System.out.println(ie);
            }
        }
    }
}

public class VolatileKeywordExample
{
    static VolatileClass vc = new VolatileClass();

    static void callVolatileMethod(){
        Thread t1 = new Thread(()->{
            vc.achieveSynchronization();
        });
        Thread t2 = new Thread(()->{
            vc.achieveSynchronization();
        });
        t1.start();

        t2.start();
    }

    static void callNonVolatileMethod(){
        Thread t1x = new Thread(()->{
            vc.achieveAsynchronization();
        });
        Thread t2x = new Thread(()->{
            vc.achieveAsynchronization();
        });
        t1x.start();
        t2x.start();
    }

    public static void main(String[] args)
    {
        callVolatileMethod();
    }
}
