package date10032023.periodicexecution;
import java.util.Timer;
import java.util.TimerTask;

public class TimerExample
{
    public static void main(String[] args) throws InterruptedException
    {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Running: " + new java.util.Date());
            }
        }, 0, 5000);
    }
}
