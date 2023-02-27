package date24022023;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class EnumColour
{
    enum Color{
        RED, BLUE,GREEN,YELLOW, PINK
    }

    public static void main(String[] args) throws IOException
    {
        Color[] values = Color.values();

        System.out.println(Arrays.toString(values));

        List<Color> colors = Arrays.asList(values);

        Collections.shuffle(colors);

        System.out.println(colors);

        Collections.sort(colors);

        System.out.println(colors);


        Scanner sc = new Scanner(System.in);

        sc.close();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = bufferedReader.readLine();

        System.out.println(line);

        bufferedReader.close();

    }
}
