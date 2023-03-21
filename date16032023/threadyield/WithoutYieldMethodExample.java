package date16032023.threadyield;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; ++i) {
            System.out.println("Thread started:" + Thread.currentThread().getName());
        }
        System.out.println("Thread ended:" + Thread.currentThread().getName());
    }
}

public class WithoutYieldMethodExample
{
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        for (int i = 0; i < 5; ++i) {
            System.out.println("Thread started:" + Thread.currentThread().getName());
        }
        System.out.println("Thread ended:" + Thread.currentThread().getName());
    }
}
