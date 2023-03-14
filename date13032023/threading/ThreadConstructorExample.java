package date13032023.threading;

class RunnableConstructor implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " Started (from runnable), of thread group " + Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getName() + " Ended (from runnable), of thread group " + Thread.currentThread().getThreadGroup().getName());
    }
}

public class ThreadConstructorExample extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " Started, of thread group " + Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getName() + " Ended, of thread group " + Thread.currentThread().getThreadGroup().getName());
    }

    public static void main(String[] args)
    {
        ThreadConstructorExample thread1 = new ThreadConstructorExample();

        thread1.start();

        ThreadConstructorExample thread2 = new ThreadConstructorExample();

        thread2.setName("Thread-x");

        thread2.start();

        Thread thread3 = new Thread(new RunnableConstructor());

        thread3.start();

        Thread thread4 = new Thread(new RunnableConstructor(),"Thread-y");

        thread4.start();
    }
}
