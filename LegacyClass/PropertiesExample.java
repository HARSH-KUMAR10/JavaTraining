package LegacyClass;

import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args){
        Properties data = new Properties();
        data.put("Hello","World");
        data.put("See","You");
        data.put("Share","This");
        data.put("Win","Everything");
        data.put(1,2);
        data.put(1,4);
        System.out.println(data);
        System.out.println(data.getProperty("Win"));
        System.out.println(data.get(1));
        System.out.println(data.getProperty("Loss"));
        System.out.println(data.getProperty("Loss","Nothing"));
    }
}
