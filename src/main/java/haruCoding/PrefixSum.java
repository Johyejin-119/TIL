package haruCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 11659
public class PrefixSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());
        long[] S = new long[N + 1];

        str = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            S[i] = S[i - 1] + Integer.parseInt(str.nextToken());
        }

    }
}
