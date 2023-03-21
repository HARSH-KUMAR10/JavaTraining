package finalyearproject.nms_lite.discovery;

import java.util.Optional;

public class Profile
{
    private final Optional<String> discoveryName;
    private final Optional<String> ipAddress;
    private final Optional<SSHClient> sshProfile;

    public Optional<String> getDiscoveryName()
    {
        return discoveryName;
    }

    public Optional<String> getIpAddress()
    {
        return ipAddress;
    }

    public Optional<SSHClient> getSshProfile()
    {
        return sshProfile;
    }

    Profile(String discoveryName, String ipAddress, String userName, String password, String port){
        this.discoveryName = Optional.ofNullable(discoveryName);
        this.ipAddress = Optional.ofNullable(ipAddress);
        this.sshProfile = Optional.of(new SSHClient(userName,password,port));
    }
}
