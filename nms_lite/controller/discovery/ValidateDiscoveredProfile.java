package finalyearproject.nms_lite.controller.discovery;

import java.util.Map;
import java.util.regex.Pattern;

public class ValidateDiscoveredProfile
{
    private static final String IP_ADDRESS_OCTET = "(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";

    private final static String CARAT = "^";

    private final static String DOT_SEPARATOR = ".";

    private final static String DOLLAR = "$";

    static boolean validateDiscoveryName(String discoveryName, Map discoverProfiles)
    {
        return discoveryName.length()>4 && !discoverProfiles.containsKey(discoveryName);
    }

    static boolean validateIPAddress(String ipAddress)
    {
        return Pattern.matches(CARAT + IP_ADDRESS_OCTET + DOT_SEPARATOR
                               + IP_ADDRESS_OCTET + DOT_SEPARATOR + IP_ADDRESS_OCTET
                               + DOT_SEPARATOR + IP_ADDRESS_OCTET + DOLLAR, ipAddress);
    }
}
