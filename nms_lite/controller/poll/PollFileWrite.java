package nms_lite.controller.poll;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;

public class PollFileWrite
{
    private static final String TIME = "\"time\"";

    private static final String METRICS = "\"metrics\"";

    private static final String MEM_TOTAL = "\"system.mem.total\"";

    private static final String MEM_USED = "\"system.mem.used\"";

    private static final String MEM_FREE = "\"system.mem.free\"";

    private static final String MEM_SHARED = "\"system.mem.shared\"";

    private static final String MEM_BUFFER = "\"system.mem.buffer\"";

    private static final String MEM_CACHE = "\"system.mem.cache\"";

    private static final String MEM_AVAILABLE = "\"system.mem.available\"";

    private static final String COMMA_SAPARATOR = ", ";

    private static final String COLON = ":";

    private static final String OPEN_BRACKET = "{";

    private static final String CLOSE_BRACKET = "}";

    private static final String NEW_LINE = "\n";

    private static final String PROCESS_RUNNING = "\"system.process.running\"";

    private static final String PROCESS_WAITING = "\"system.process.waiting\"";

    private static final String MEMORY_SWAPPED = "\"system.memory.swapped\"";

    private static final String MEMORY_FREE = "\"system.memory.free\"";

    private static final String MEMORY_BUFFER = "\"system.memory.buffer\"";

    private static final String MEMORY_CACHE = "\"system.memory.cache\"";

    private static final String SWAP_IN = "\"system.swap.memory.in\"";

    private static final String SWAP_OUT = "\"system.swap.memory.out\"";

    private static final String BLOCK_IN = "\"system.block.in\"";

    private static final String BLOCK_OUT = "\"system.block.out\"";

    private static final String SYSTEM_INTERRUPT = "\"system.system.interrupt\"";

    private static final String SYSTEM_CONTEXT_SWITCH = "\"system.system.context.switch\"";

    private static final String CPU_USER_PERCENTAGE = "\"system.cpu.user.percentage\"";

    private static final String CPU_SYSTEM_PERCENTAGE = "\"system.cpu.system.percentage\"";

    private static final String CPU_IDEAL_PERCENTAGE = "\"system.cpu.ideal.percentage\"";

    private static final String CPU_WAIT_PERCENTAGE = "\"system.cpu.wait.percentage\"";

    private static final String CPU_STALE_PERCENTAGE = "\"system.cpu.stale.percentage\"";


    public static void connectionWrite(String result, String discoveryName)
    {
        try
        {
            new File("./src/logs/" + discoveryName).mkdirs();
            try (FileWriter fileWriter = new FileWriter("./src/logs/" + discoveryName + "/connection.json", true))
            {
                Date date = new Date();
                String current_time = "\"" + (date.getHours() > 9 ? date.getHours() : "0" + date.getHours())
                                      + ":" + (date.getMinutes() > 9 ? date.getMinutes() : "0" + date.getMinutes())
                                      + ":" + (date.getSeconds() > 9 ? date.getSeconds() : "0" + date.getSeconds()) + "\"";
                fileWriter.write(OPEN_BRACKET + TIME + COLON + current_time
                                 + COMMA_SAPARATOR + METRICS + COLON + "\"" + result + "\""
                                 + CLOSE_BRACKET + COMMA_SAPARATOR + NEW_LINE);
            }
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    public static void freeMetricWrite(String commandOutput, String discoveryName)
    {
        try (FileWriter fileWriter = new FileWriter("./src/logs/" + discoveryName + "/memory.json", true))
        {
            String[] commandList = commandOutput.split(" ");
            ArrayList<String> commandFilterOutput = new ArrayList<>();
            for (String command : commandList)
            {
                if (command.strip().length() > 0)
                {
                    commandFilterOutput.add(command.strip());
                }
            }
            if (commandFilterOutput.size() == 8)
            {
                Date date = new Date();
                String current_time = "\"" + (date.getHours() > 9 ? date.getHours() : "0" + date.getHours())
                                      + ":" + (date.getMinutes() > 9 ? date.getMinutes() : "0" + date.getMinutes())
                                      + ":" + (date.getSeconds() > 9 ? date.getSeconds() : "0" + date.getSeconds()) + "\"";
                fileWriter.write(OPEN_BRACKET + TIME + COLON + current_time
                                 + COMMA_SAPARATOR + METRICS + COLON + OPEN_BRACKET
                                 + MEM_TOTAL + COLON + commandFilterOutput.get(1)
                                 + COMMA_SAPARATOR + MEM_USED + COLON + commandFilterOutput.get(2)
                                 + COMMA_SAPARATOR + MEM_FREE + COLON + commandFilterOutput.get(3)
                                 + COMMA_SAPARATOR + MEM_SHARED + COLON + commandFilterOutput.get(4)
                                 + COMMA_SAPARATOR + MEM_BUFFER + COLON + commandFilterOutput.get(5)
                                 + COMMA_SAPARATOR + MEM_CACHE + COLON + commandFilterOutput.get(6)
                                 + COMMA_SAPARATOR + MEM_AVAILABLE + COLON + commandFilterOutput.get(7)
                                 + CLOSE_BRACKET + CLOSE_BRACKET + COMMA_SAPARATOR + NEW_LINE);
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    public static void vmstatMetricWrite(String commandOutput, String discoveryName)
    {
        try (FileWriter fileWriter = new FileWriter("./src/logs/" + discoveryName + "/metric.json", true))
        {
            String[] commandSplitList = commandOutput.split(" ");
            ArrayList<String> commandFilterOutput = new ArrayList<>();
            for (String command : commandSplitList)
            {
                if (command.strip().length() > 0)
                {
                    commandFilterOutput.add(command.strip());
                }
            }
            if (commandFilterOutput.size() == 17)
            {

                String[] commandList = new String[17];
                for (int i = 0; i < 17; i++)
                {
                    commandList[i] = commandFilterOutput.get(i);
                }
                Date date = new Date();
                String current_time = "\"" + (date.getHours() > 9 ? date.getHours() : "0" + date.getHours())
                                      + ":" + (date.getMinutes() > 9 ? date.getMinutes() : "0" + date.getMinutes())
                                      + ":" + (date.getSeconds() > 9 ? date.getSeconds() : "0" + date.getSeconds()) + "\"";
                fileWriter.write(OPEN_BRACKET + TIME + COLON + current_time
                                 + COMMA_SAPARATOR + METRICS + COLON + OPEN_BRACKET
                                 + PROCESS_RUNNING + COLON + commandList[0]
                                 + COMMA_SAPARATOR + PROCESS_WAITING + COLON + commandList[1]
                                 + COMMA_SAPARATOR + MEMORY_SWAPPED + COLON + commandList[2]
                                 + COMMA_SAPARATOR + MEMORY_FREE + COLON + commandList[3]
                                 + COMMA_SAPARATOR + MEMORY_BUFFER + COLON + commandList[4]
                                 + COMMA_SAPARATOR + MEMORY_CACHE + COLON + commandList[5]
                                 + COMMA_SAPARATOR + SWAP_IN + COLON + commandList[6]
                                 + COMMA_SAPARATOR + SWAP_OUT + COLON + commandList[7]
                                 + COMMA_SAPARATOR + BLOCK_IN + COLON + commandList[8]
                                 + COMMA_SAPARATOR + BLOCK_OUT + COLON + commandList[9]
                                 + COMMA_SAPARATOR + SYSTEM_INTERRUPT + COLON + commandList[10]
                                 + COMMA_SAPARATOR + SYSTEM_CONTEXT_SWITCH + COLON + commandList[11]
                                 + COMMA_SAPARATOR + CPU_USER_PERCENTAGE + COLON + commandList[12]
                                 + COMMA_SAPARATOR + CPU_SYSTEM_PERCENTAGE + COLON + commandList[13]
                                 + COMMA_SAPARATOR + CPU_IDEAL_PERCENTAGE + COLON + commandList[14]
                                 + COMMA_SAPARATOR + CPU_WAIT_PERCENTAGE + COLON + commandList[15]
                                 + COMMA_SAPARATOR + CPU_STALE_PERCENTAGE + COLON + commandList[16]
                                 + CLOSE_BRACKET + CLOSE_BRACKET + COMMA_SAPARATOR + NEW_LINE);
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
