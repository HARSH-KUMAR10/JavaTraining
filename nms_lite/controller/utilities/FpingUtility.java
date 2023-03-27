package nms_lite.controller.utilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FpingUtility
{
    public static String fpingUtility(String ipAddress)
    {
        String ret = "";
        try
        {
            ProcessBuilder processBuilder = new ProcessBuilder("fping", "-c", "3", "-q", ipAddress);
            Process process = processBuilder.start();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(process.getErrorStream())))
            {
                String tempReader;
                while ((tempReader = br.readLine()) != null)
                {
                    ret += tempReader;
                }
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
        return ret;
    }
}
