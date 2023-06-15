package harucoding.traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 1920
public class FindInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer str = new StringTokenizer(br.readLine(), " ");;
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(A);

    }
}
