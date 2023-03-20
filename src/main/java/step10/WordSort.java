package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 1181
public class WordSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] alphabet = new String[N];
        for (int i = 0; i < N; i++) {
            alphabet[i] = br.readLine();
        }
        br.close();

        Arrays.sort(alphabet, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length() - o2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(alphabet[0]).append('\n');
        for (int i = 1; i < N; i++) {
            if (!alphabet[i].equals(alphabet[i-1])) {
                sb.append(alphabet[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
