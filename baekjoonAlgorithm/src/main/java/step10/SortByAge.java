package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 10814
public class SortByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] member = new String[N][2];

        StringTokenizer str;
        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine(), " ");
            member[i][0] = str.nextToken();
            member[i][1] = str.nextToken();
        }
        br.close();


        Arrays.sort(member, (s1, s2) -> Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(member[i][0]).append(' ').append(member[i][1]).append('\n');

        }
        System.out.print(sb);
    }
}
