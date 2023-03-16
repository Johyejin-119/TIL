package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 11651
public class SortCoordinate2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] xy = new int[N][2];
        StringTokenizer str;

        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine(), " ");
            xy[i][0] = Integer.parseInt(str.nextToken());
            xy[i][1] = Integer.parseInt(str.nextToken());
        }
        br.close();

        Arrays.sort(xy, (e1, e2) -> (e1[1] == e2[1] ? e1[0] - e2[0] : e1[1] - e2[1]));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(xy[i][0] + " " + xy[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
