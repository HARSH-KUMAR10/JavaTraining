package nms_lite.controller.utilities;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SshUtility
{
    public static ArrayList<String> sshUtility(String username, String ipAddress, String password, String port)
    {
        ArrayList<String> ret = new ArrayList<>();
        try
        {
            JSch jSch = new JSch();
            if (jSch != null)
            {
                Session session = jSch.getSession(username, ipAddress, Integer.parseInt(port));
                java.util.Properties config = new java.util.Properties();
                config.put("StrictHostKeyChecking", "no");
                if (session != null)
                {
                    session.setPassword(password);
                    session.setConfig(config);
                    session.connect();
                }
                else
                {

                }
                if (session.isConnected())
                {
                    Channel channel = session.openChannel("exec");

                    ((ChannelExec) channel)
                            .setCommand("free -w | awk 'NR==2';vmstat -w | awk 'NR==3'");

                    channel.setInputStream(null);

                    InputStream instream = channel.getInputStream();

                    channel.connect();

                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(instream));

                    String command_output;

                    while ((command_output = bufferedReader.readLine()) != null)
                    {
                        ret.add(command_output);
                    }
                    channel.disconnect();
                }
                else
                {
                }
                session.disconnect();
            }
            else
            {
            }
        }
        catch (Exception exception)
        {
            System.out.println(" = " + exception.getMessage());
        }
        return ret;
    }
}
