package finalyearproject.nms_lite.model.discovery;

import model.discovery.Profile;

import java.util.HashMap;

public class DiscoveredProfiles
{
    public final HashMap<String, model.discovery.Profile> discoveredProfile = new HashMap<>();

    public HashMap<String, model.discovery.Profile> getDiscoveredProfile()
    {
        return discoveredProfile;
    }

    public model.discovery.Profile setDiscovery(String discoveryName, String ipAddress, String userName, String password, String port)
    {
        return this.discoveredProfile.putIfAbsent(discoveryName,
                new Profile(discoveryName, ipAddress, userName, password, port));
    }
}
