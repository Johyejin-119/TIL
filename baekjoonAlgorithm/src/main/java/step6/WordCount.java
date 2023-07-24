package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(br.readLine(), " ");
        System.out.println(stz.countTokens());
/*

        String s = br.readLine().trim();

        if (s.isEmpty()) {
            System.out.println("0");
        } else {
            String[] sb = s.split(" ");
            System.out.println(sb.length);
        }
*/
    }
}
