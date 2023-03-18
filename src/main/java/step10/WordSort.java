package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1181
public class WordSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] alphabet = new String[N];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            alphabet[i] = br.readLine();
        }
        br.close();

        Arrays.sort(alphabet, (e1, e2) -> (e1.length() - e2.length()));
        //Arrays.sort(alphabet, (e1, e2) -> (e1.equals(e2) ? e2.charAt(0) - e1.charAt(0) : e1.charAt(0) - e2.charAt(0)));
        for (int i = 0; i < N; i++) {
            sb.append(alphabet[i]).append('\n');
        }
        System.out.println(sb);



    }
}
