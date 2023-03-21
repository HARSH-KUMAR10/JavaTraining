package date17032023.threadwait;

import java.io.FileReader;

public class WriteToFileWithTimer
{

    public WriteToFileWithTimer(Runnable task, long timeout)
    {

    }

    public static void main(String[] args)
    {
        try
        {
            final String fileName = "myFile1.log";
            String text = "Some text\n";
            long time = 20000;
            System.out.println("Main thread is running");
            Thread.currentThread().getThreadGroup().list();
            TimeoutTerminationThreadExample timerThreadExample = new TimeoutTerminationThreadExample(fileName, text, time);
            Thread thread = new Thread(timerThreadExample);
            thread.start();
            Thread.currentThread().getThreadGroup().list();
            final String fileName1 = "myFile2.log";
            String text1 = "Some another text\n";
            long time1 = 10000;
            Thread.currentThread().getThreadGroup().list();
            TimeoutTerminationThreadExample timerThreadExample1 = new TimeoutTerminationThreadExample(fileName1,text1,time1);
            Thread thread1 = new Thread(timerThreadExample1);
            thread1.start();
            Thread.currentThread().getThreadGroup().list();
            thread.join();
            thread1.join();
//        try
//        {
//            timerThreadExample.join();
//        }
//        catch (Exception exception)
//        {
//            System.out.println(exception);
//        }
            Thread.currentThread().getThreadGroup().list();

        System.out.println("File reading ...");
        try
        {
            System.out.println("Output of "+fileName);
            FileReader fileReader = new FileReader(fileName);
            int incomingCharacter;
            while((incomingCharacter = fileReader.read())!=-1){
                System.out.print((char) incomingCharacter);
            }
            System.out.println("Output of "+fileName1);
            fileReader = new FileReader(fileName1);
            while((incomingCharacter = fileReader.read())!=-1){
                System.out.print((char) incomingCharacter);
            }
            fileReader.close();
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
