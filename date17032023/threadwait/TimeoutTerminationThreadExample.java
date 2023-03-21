package date17032023.threadwait;

import java.io.FileWriter;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

public class TimeoutTerminationThreadExample implements Runnable
{
    private final AtomicBoolean threadRunFlag = new AtomicBoolean(true);

    private final Optional<String> fileName;

    private final Optional<String> textToAdd;

    private final long startTime = System.currentTimeMillis();

    private final long totalRunningTime; // In seconds

    TimeoutTerminationThreadExample(String fileName, String text, long time)
    {
        this.fileName = Optional.ofNullable(fileName);
        this.textToAdd = Optional.ofNullable(text);
        this.totalRunningTime = time;
    }


    @Override
    public void run()
    {
        try
        {
            if (fileName.isPresent() && textToAdd.isPresent())
            {
                System.out.println("-- Starting to write on file --");
                long iteration = 0;
                while (threadRunFlag.get())
                {
                    long currentTime = System.currentTimeMillis() - startTime;
                    if ((currentTime) > (totalRunningTime))
                    {
                        System.out.println("Stopping thread - " + Thread.currentThread().getName());
                        threadRunFlag.set(false);
                    }
                    else
                    {
                        iteration++;
                    }
                }
                try (FileWriter fileWriter = new FileWriter(fileName.get(),true))
                {
                    fileWriter.write(totalRunningTime+" : "+iteration + "\n");
                    System.out.println("-- File writing ended --");
                }
                catch (Exception exception)
                {
                    System.out.println(exception.getMessage());
                }
            }
            else
            {
                System.out.println("FileName and text not found");
            }
        }
        catch (Exception exception)
        {
            System.out.println("Exception occurred while executing ...");
            System.out.println(exception.getMessage());
        }
    }
}
