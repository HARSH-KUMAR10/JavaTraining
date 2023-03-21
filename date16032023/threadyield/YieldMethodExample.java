package date16032023.threadyield;

class MyYieldThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; ++i) {
            Thread.yield();
            System.out.println("Thread started:" + Thread.currentThread().getName());
        }
        System.out.println("Thread ended:" + Thread.currentThread().getName());
    }
}

public class YieldMethodExample
{
    public static void main(String[] args) {
        MyYieldThread thread = new MyYieldThread();
        thread.start();
        for (int i = 0; i < 5; ++i) {
            System.out.println("Thread started:" + Thread.currentThread().getName());
            Thread.yield();
        }
        System.out.println("Thread ended:" + Thread.currentThread().getName());
    }
}
