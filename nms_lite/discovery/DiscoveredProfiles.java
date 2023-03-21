package finalyearproject.nms_lite.discovery;

import java.util.HashMap;

public class DiscoveredProfiles
{
    public final HashMap<String, Profile> discoveredProfile = new HashMap<>();

    public HashMap<String, Profile> getDiscoveredProfile()
    {
        return discoveredProfile;
    }

    public Profile setDiscovery(String discoveryName, String ipAddress, String userName, String password, String port)
    {
        return this.discoveredProfile.putIfAbsent(discoveryName,
                new Profile(discoveryName, ipAddress, userName, password, port));
    }
}
