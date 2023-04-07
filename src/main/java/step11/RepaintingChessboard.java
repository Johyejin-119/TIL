package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1018
public class RepaintingChessboard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());

        boolean[][] check = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            for (int j = 0; j < M; j++) {
                checkWhiteOrBlack(check, i, row, j);
            }
        }

    }

    private static void checkWhiteOrBlack(boolean[][] check, int i, String row, int j) {
        if (row.charAt(j) == 'W') { // white
            check[i][j] = true;
        }
        else { // black
            check[i][j] = false;
        }
    }
}
