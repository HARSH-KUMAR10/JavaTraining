package nms_lite.model.discovery;

import java.util.Optional;

public class SSHClient
{
    private final Optional<String> userName;

    private final Optional<String> password;

    private final Optional<String> port;

    public Optional<String> getUserName()
    {
        return userName;
    }


    public Optional<String> getPassword()
    {
        return password;
    }


    public Optional<String> getPort()
    {
        return port;
    }


    SSHClient(String userName, String password, String port)
    {
        this.userName = Optional.ofNullable(userName);
        this.password = Optional.ofNullable(password);
        this.port = Optional.ofNullable(port);
    }
}
