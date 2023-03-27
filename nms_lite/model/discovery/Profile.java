package nms_lite.model.discovery;

import java.util.Optional;

public class Profile
{
    private final Optional<String> discoveryName;

    private final Optional<String> ipAddress;

    private final Optional<Long> pollTime;

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

    public Optional<Long> getPollTime()
    {
        return pollTime;
    }

    public Profile(String discoveryName, String ipAddress, long pollTime, String userName, String password, String port)
    {
        this.discoveryName = Optional.ofNullable(discoveryName);
        this.ipAddress = Optional.ofNullable(ipAddress);
        this.pollTime = Optional.ofNullable(pollTime);
        this.sshProfile = Optional.of(new SSHClient(userName, password, port));
    }
}
