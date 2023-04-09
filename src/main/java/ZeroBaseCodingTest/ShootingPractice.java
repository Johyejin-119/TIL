package ZeroBaseCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 27958
public class ShootingPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[][] boardNum = new int[N][N];
        int[] shoot = new int[K];


        for (int row = 0; row < N; row++) {
            str = new StringTokenizer(br.readLine(), " ");
            for (int col = 0; col < N; col++) {
                boardNum[row][col] = Integer.parseInt(str.nextToken());
            }
        }

        str = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < K; i++) {
            shoot[i] = Integer.parseInt(str.nextToken());
        }

        br.close();



    }

}
