package date18032023;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ExecuteMultipleTaskWithTimeoutExample
{
    public static void main(String[] args)
    {

        ExecuteTaskTillTimeout executeTaskTillTimeout = new ExecuteTaskTillTimeout(() -> {
            System.out.println("Printing this");
        }, 2000);
        ExecuteTaskTillTimeout executeTaskTillTimeout1 = new ExecuteTaskTillTimeout(() -> {
            System.out.println("Printing that");
        }, 4000);
        ExecuteTaskTillTimeout executeTaskTillTimeout2 = new ExecuteTaskTillTimeout(() -> {
            ArrayList<String> processOutput = new ArrayList<>();
            try
            {
                // Running command using process builder
                ProcessBuilder processBuilder = new ProcessBuilder("fping","-c","3","-q","10.20.40.197");

                Process process = processBuilder.start();

                BufferedReader readProcessOutput = new BufferedReader(new InputStreamReader(process.getErrorStream()));

                // Collecting output of ping
                String str;
                while ((str = readProcessOutput.readLine()) != null)
                {
                    processOutput.add(str);
                }

            }
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }
            System.out.println(processOutput);
        },10000);

        ExecuteTaskTillTimeout executeTaskTillTimeout3 = new ExecuteTaskTillTimeout(null,2000);
        executeTaskTillTimeout2.start();
        executeTaskTillTimeout.start();
        executeTaskTillTimeout1.start();
        executeTaskTillTimeout3.start();
    }
}
