package nms_lite.controller.poll;

import nms_lite.controller.utilities.FpingUtility;
import nms_lite.controller.utilities.SshUtility;
import nms_lite.model.discovery.Profile;
import nms_lite.model.discovery.SSHClient;

import java.util.ArrayList;
import java.util.Optional;

public class Poll implements Runnable
{
    Optional<Profile> profile;

    public Poll(Profile profile)
    {
        this.profile = Optional.ofNullable(profile);
    }

    @Override
    public void run()
    {
        try
        {
            if (this.profile.isPresent())
            {
                long startTime = System.currentTimeMillis();
                while (true)
                {
                    long currentTime = System.currentTimeMillis();
                    if (currentTime - startTime >= this.profile.get().getPollTime().get())
                    {
                        startTime = currentTime;
                        String connectionCheck = FpingUtility.fpingUtility(this.profile.get().getIpAddress().get());
                        if (connectionCheck.length() == 0 ?
                                false : connectionCheck.split(" ")[4].split("/")[2].equalsIgnoreCase("0%,"))
                        {
                            PollFileWrite.connectionWrite(connectionCheck,this.profile.get().getDiscoveryName().get());
                            Optional<SSHClient> sshClient = this.profile.get().getSshProfile();
                            if (sshClient.isPresent())
                            {
                                ArrayList<String> sshOutput = SshUtility
                                        .sshUtility(sshClient.get().getUserName().get(),
                                                this.profile.get().getIpAddress().get(),
                                                sshClient.get().getPassword().get(),
                                                sshClient.get().getPort().get());
                                PollFileWrite.freeMetricWrite(sshOutput.get(0),this.profile.get().getDiscoveryName().get());
                                PollFileWrite.vmstatMetricWrite(sshOutput.get(1),this.profile.get().getDiscoveryName().get());
                            }
                        }
                    }
                }
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
