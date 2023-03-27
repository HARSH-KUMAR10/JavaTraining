package nms_lite.model.discovery;

import java.util.HashMap;

public class DiscoveredProfiles
{
    public final HashMap<String, Profile> discoveredProfile = new HashMap<>();

    public HashMap<String, Profile> getDiscoveredProfile()
    {
        return discoveredProfile;
    }

    public Profile setDiscovery(String discoveryName, String ipAddress,long pollTime, String userName, String password, String port)
    {
        return this.discoveredProfile.putIfAbsent(discoveryName,
                new Profile(discoveryName, ipAddress,pollTime, userName, password, port));
    }
}
