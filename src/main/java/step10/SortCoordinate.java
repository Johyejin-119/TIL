package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 11650
public class SortCoordinate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] xy = new int[N][N];
        int first;
        int second;
        
        StringTokenizer str;
        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine(), " ");
            first = Integer.parseInt(str.nextToken());
            second = Integer.parseInt(str.nextToken());
            
            xy[first][second]++;
        }
        br.close();

        for (int i = xy.length-1; i >= 0; i--) {
            for (int j = xy.length-1; j >= 0; j--) {
                if (xy[i][j] > 0) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
