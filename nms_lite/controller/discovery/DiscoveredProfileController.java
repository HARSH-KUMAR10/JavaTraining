package nms_lite.controller.discovery;

import nms_lite.model.discovery.DiscoveredProfiles;
import nms_lite.model.discovery.Profile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Optional;

public class DiscoveredProfileController
{
    static private final DiscoveredProfiles discoveredProfiles = new DiscoveredProfiles();

    static private final BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    public static Profile setDiscoverProfile(String discoverName, String ipAddress,long pollTime, String username, String password, String port)
    {
        return discoveredProfiles.setDiscovery(discoverName, ipAddress,pollTime, username, password, port);
    }

    public static HashMap<String, Profile> getDiscoveredProfile()
    {
        return discoveredProfiles.getDiscoveredProfile();
    }

    public static String setDiscoveryName()
    {
        Optional<String> discoveryName = Optional.empty();
        try
        {
            discoveryName = Optional.ofNullable(br.readLine());
            while (discoveryName.isEmpty() ||
                   !ValidateDiscoveredProfile.validateDiscoveryName(discoveryName.get(), discoveredProfiles.discoveredProfile))
            {
                if (discoveryName.isEmpty())
                {
                    System.out.print("Discovery name cannot be empty, enter again: ");
                }
                else if (discoveryName.get().length() < 5)
                {
                    System.out.print("Discovery name cannot be less than 4 letters, enter again: ");
                }
                else
                {
                    System.out.print("Discovery name already exists, enter again: ");
                }
                discoveryName = Optional.ofNullable(br.readLine());
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }

        return discoveryName.get();
    }

    public static String setIPAddress()
    {
        Optional<String> ipAddress = Optional.empty();
        try
        {
            ipAddress = Optional.ofNullable(br.readLine());
            while (ipAddress.isEmpty() || !ValidateDiscoveredProfile.validateIPAddress(ipAddress.get()))
            {
                if (ipAddress.isEmpty())
                {
                    System.out.print("IP address can't be empty, enter again: ");
                }
                else
                {
                    System.out.print("Wrong IP address format, enter again: ");
                }
                ipAddress = Optional.ofNullable(br.readLine());
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
        return ipAddress.get();
    }

    public static String setSshUserName()
    {
        Optional<String> sshUserName = Optional.empty();
        try
        {
            sshUserName = Optional.ofNullable(br.readLine());
            while (sshUserName.isEmpty() || sshUserName.get().length() < 3)
            {
                System.out.print("SSH username length should be more than 3, enter again: ");
                sshUserName = Optional.ofNullable(br.readLine());
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
        return sshUserName.get();
    }

    public static String setSshPassword()
    {
        Optional<String> sshPassword = Optional.empty();
        try
        {
            sshPassword = Optional.ofNullable(br.readLine());
            while (sshPassword.isEmpty() || sshPassword.get().length() < 3)
            {
                System.out.print("SSH password length should be more than 3, enter again: ");
                sshPassword = Optional.ofNullable(br.readLine());
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
        return sshPassword.get();
    }

    public static String setPort()
    {
        Optional<String> port = Optional.empty();
        try
        {
            port = Optional.ofNullable(br.readLine());
            int integralPort = Integer.valueOf(port.get());
            while (port.isEmpty() || !(integralPort >= 0 && integralPort <= 65535))
            {
                System.out.print("SSH port number range (0-65535), enter again: ");
                port = Optional.ofNullable(br.readLine());
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
        return port.get();
    }

    public static long setPollTime()
    {
        try
        {
            switch (br.readLine())
            {
                case "1" : return 10000;
                case "2" : return 20000;
                default : return 50000;
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
            return 50000;
        }
    }
}
