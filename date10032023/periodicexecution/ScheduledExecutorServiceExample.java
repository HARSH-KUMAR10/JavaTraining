package date10032023.periodicexecution;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledExecutorServiceExample
{
    private static void run() {
        System.out.println("Running: " + new java.util.Date());
    }

    public static void main(String[] args)
    {
        ScheduledExecutorService executorService;
        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(ScheduledExecutorServiceExample::run, 0, 5, TimeUnit.SECONDS);
    }
}
