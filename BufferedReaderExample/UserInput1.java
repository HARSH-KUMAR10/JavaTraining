package BufferedReaderExample;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class UserInput1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(br.readLine());
        System.out.println(s+" : "+num);
    }
}
