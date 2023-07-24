package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2563
public class ColorPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer str;

        int[][] color = new int[100][100];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(str.nextToken());
            int column = Integer.parseInt(str.nextToken());

            for (int j = row; j < (row + 10); j++) {
                for (int k = column; k < (column + 10); k++) {
                    color[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < color[i].length; j++) {
                if (color[i][j] == 1) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
