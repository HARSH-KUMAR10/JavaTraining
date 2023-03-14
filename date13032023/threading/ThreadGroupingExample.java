package date13032023.threading;

public class ThreadGroupingExample
{
    static ThreadGroup newThreadGroupStats(String name)
    {
        System.out.println("============ New Thread Group =================");
        ThreadGroup threadGroup = new ThreadGroup(name);
        System.out.println("Thread group name ("+name+"): " + threadGroup.getName());
        System.out.println("Thread group parent (main): " + threadGroup.getParent().getName());
        System.out.println("Thread group active count (main): " + threadGroup.getParent().activeCount());
        System.out.println("Thread group active group count (main): " + threadGroup.getParent().activeGroupCount());
        System.out.println("Thread group maximum priority: " + threadGroup.getMaxPriority());
        System.out.println("Is secondary thread group parent on main: " + threadGroup.parentOf(Thread.currentThread().getThreadGroup()));
        System.out.println("Is main thread group parent on secondary: " + Thread.currentThread().getThreadGroup().parentOf(threadGroup));
        System.out.println("===============================================");
        return threadGroup;
    }
    static void creatingGroupAndThread(){
        System.out.println("=============== New Group and threads inside ===============");
        ThreadGroup secondary = newThreadGroupStats("secondary");
        Thread t1 = new Thread(secondary, () -> {
            System.out.println(Thread.currentThread().getName() + " is current thread, from group " + Thread.currentThread().getThreadGroup().getName());
            ThreadGroup thirdGroup = new ThreadGroup("third");
            Thread secondaryThread = new Thread(()->{
                System.out.println("Secondary thread started");
                System.out.println("Secondary thread ended");
            });
            Thread thirdGroupThread = new Thread(thirdGroup,()->{
                System.out.println("============"+Thread.currentThread().getName()+"================");
                System.out.println("Total active group count (under third group view): " + Thread.currentThread().getThreadGroup().activeGroupCount());
                System.out.println("Total active thread count (under third group view): " + Thread.currentThread().getThreadGroup().activeCount());
                System.out.println("Thread Group name : "+Thread.currentThread().getThreadGroup().getName());
                System.out.println("================================================================");
            },"Third-Group-Thread");
            secondaryThread.start();
            thirdGroupThread.start();
        });

        System.out.println("Total active thread count: " + Thread.activeCount());
        System.out.println("Total active group count (under main group view): " + Thread.currentThread().getThreadGroup().activeGroupCount());
        System.out.println("Total active group count (under secondary group view): " + secondary.activeGroupCount());
        System.out.println("Total active thread count (under main group view): " + Thread.currentThread().getThreadGroup().activeCount());
        System.out.println("Total active thread count (under secondary group view): " + secondary.activeCount());
        t1.start();
        System.out.println("Execution ended");
        System.out.println("========================================================");
    }

    public static void main(String[] args)
    {
        creatingGroupAndThread();
    }
}
