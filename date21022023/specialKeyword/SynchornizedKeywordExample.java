package date21022023.specialKeyword;

public class SynchornizedKeywordExample
{
    private synchronized void run()
    {
        try
        {
            System.out.println("Start sync running: " + Thread.currentThread().getId());
            Thread.sleep(3000);
            System.out.println("Stopped sync running: " + Thread.currentThread().getId());
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    private void run2()
    {
        try
        {
            System.out.println("Start running: " + Thread.currentThread().getId());
            Thread.sleep(1000*((Math.round(Math.random()*3)+1)));
            System.out.println("Stopped running: " + Thread.currentThread().getId());
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

     void withSynchronization(){
        final SynchornizedKeywordExample obj = new SynchornizedKeywordExample();
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                obj.run();
            }
        };
        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                obj.run();
            }
        };
        t1.start();
        t2.start();
    }

     void withoutSynchronization(){
        final SynchornizedKeywordExample obj = new SynchornizedKeywordExample();
        Thread t1x = new Thread(() ->
        {
            obj.run2();
        }
        );
        Thread t2x = new Thread(() ->
        {
            obj.run2();
        }
        );
        t1x.start();
        t2x.start();

    }

    public static void main(String[] args)
    {
        SynchornizedKeywordExample obj = new SynchornizedKeywordExample();
        obj.withoutSynchronization();
    }
}
