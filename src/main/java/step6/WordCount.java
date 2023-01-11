package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().trim();

        if (s.isEmpty()) {
            System.out.println("0");
        } else {
            String[] sb = s.split(" ");
            System.out.println(sb.length);
        }
    }
}
