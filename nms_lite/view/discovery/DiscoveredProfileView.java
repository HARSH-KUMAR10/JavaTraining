package finalyearproject.nms_lite.view.discovery;

import controller.discovery.DiscoveredProfileCheck;
import controller.discovery.DiscoveredProfileController;
import model.discovery.Profile;
import model.discovery.SSHClient;

import java.util.Map;
import java.util.Optional;

public class DiscoveredProfileView
{
    public void setDiscoverProfile()
    {
        try
        {
            System.out.println("=============== Discovery ==============");
            System.out.print("Enter discovery name: ");
            String discoveryName = DiscoveredProfileController.setDiscoveryName();
            System.out.print("Enter IP address: ");
            String ipAddress = DiscoveredProfileController.setIPAddress();
            System.out.print("Enter SSH username: ");
            String sshUserName = DiscoveredProfileController.setSshUserName();
            System.out.print("Enter SSH password: ");
            String sshPassword = DiscoveredProfileController.setSshPassword();
            System.out.print("Enter SSH port: ");
            String port = DiscoveredProfileController.setPort();
            if (DiscoveredProfileCheck.checkConnection(ipAddress) &&
                DiscoveredProfileCheck.checkLogin(ipAddress, sshUserName, sshPassword, port) &&
                DiscoveredProfileCheck.askProvision())
            {
                if (!(DiscoveredProfileController
                              .setDiscoverProfile(discoveryName, ipAddress, sshUserName, sshPassword, port)
                      == null))
                {
                    System.out.println("Unable to add profile");
                }
                else
                {
                    System.out.println("Added profile successfully");
                }
            }
            else
            {
                System.out.println("Failed to add profile");
            }
            System.out.println("=======================================");
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }

    public void getDiscoveredProfiles()
    {
        Map<String, Profile> discoveredProfile = DiscoveredProfileController.getDiscoveredProfile();
        for (Profile profile : discoveredProfile.values())
        {
            Optional<SSHClient> sshProfile = profile.getSshProfile();
            System.out.println("Discovery Name: " + profile.getDiscoveryName().get()
                               + "\nIP Address: " + profile.getIpAddress().get());
            if (sshProfile.isPresent())
            {
                System.out.println("SSH username: " + sshProfile.get().getUserName().get());
                System.out.println("SSH password: " + sshProfile.get().getPassword().get());
                System.out.println("SSH port: " + sshProfile.get().getPort().get());
            }
        }

    }
}
