package nms_lite.view;

import nms_lite.view.discovery.DiscoveredProfileView;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StartUp
{
    static DiscoveredProfileView discoverProfileView = new DiscoveredProfileView();
    public static void start()
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true)
            {
                System.out.println("Welcome to LMS");
                System.out.print("1. Discovery\n2. Show Profiles\nEnter choice: ");
                switch (br.readLine())
                {
                    case "1" -> discoverProfileView.setDiscoverProfile();
                    case "2" -> discoverProfileView.getDiscoveredProfiles();
                }
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
