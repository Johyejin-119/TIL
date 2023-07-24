package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2675
public class RepeatString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] testOnce = br.readLine().split(" ");

            int repeat = Integer.parseInt(testOnce[0]);

            for (byte val : testOnce[1].getBytes()) {
                for (int j = 0; j < repeat; j++) {
                    sb.append((char) val);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
