package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1018
public class RepaintingChessboard {
    public static boolean[][] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());

        check = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            for (int j = 0; j < M; j++) {
                checkWhiteOrBlack(check, i, row, j);
            }
        }

        int result = 0;
        for (int i = 0; i < N-7; i++) {
            for (int j = 0; j < M-7; j++) {
                result = repaintingCount(i, j);
            }
        }
        System.out.println(result);
    }

    public static int repaintingCount(int row, int col) {
        int count = 0;
        int min = 64;
        boolean firstColor = check[row][col];

        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j++) {
                if (firstColor != check[i][j]) count++;
                firstColor = (!firstColor);
            }
            firstColor = (!firstColor);
        }
        count = Math.min(count, (64 - count));
        min = Math.min(min, count);
        return min;
    }

    public static void checkWhiteOrBlack(boolean[][] check, int i, String row, int j) {
        if (row.charAt(j) == 'W') { // white
            check[i][j] = true;
        }
        else { // black
            check[i][j] = false;
        }
    }
}
