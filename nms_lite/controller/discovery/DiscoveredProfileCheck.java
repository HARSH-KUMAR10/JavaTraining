package nms_lite.controller.discovery;

import nms_lite.controller.utilities.FpingUtility;
import nms_lite.controller.utilities.SshUtility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DiscoveredProfileCheck
{
    public static boolean checkConnection(String ipAddress)
    {
        String response = FpingUtility.fpingUtility(ipAddress);
        if (response.length() == 0)
        {
            System.out.println("Unable to connect to device");
            return false;
        }
        else
        {
            return response.split(" ")[4].split("/")[2].equalsIgnoreCase("0%,");
        }
    }

    public static boolean checkLogin(String ipAddress, String username, String password, String port)
    {
        if (SshUtility.sshUtility(username, ipAddress, password, port).size() != 0)
        {
            return true;
        }
        else
        {
            System.out.println("Unable to login to device");
            return false;
        }
    }

    public static boolean askProvision()
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Do you want to provision? (yes/no): ");
            return br.readLine().equalsIgnoreCase("yes");
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
            return false;
        }
    }
}
