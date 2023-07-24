package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2738
public class Matrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());
        int[][] size = new int[2*N][M]; // 6 3
        int[][] sum = new int[N][M]; // 9


        for (int i = 0; i < 2*N; i++) {
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                size[i][j] = Integer.parseInt(str.nextToken());
                //System.out.println("size"+"[" + i + "]"+"[" + j + "]" + " = " + size[i][j]);
                if (i >= N) {
                    sum[i-N][j] = size[i][j] + size[i-N][j];
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
