package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1929
public class GetPrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(str.nextToken());
        int N = Integer.parseInt(str.nextToken());

        int[] prime = new int[N + 1];
        prime[1] = 1;

        for (int i = 2; i <= N; i++) {
            for (int j = 2; i*j <= N; j++) {
                prime[i*j] = 1;
            }
        }

        for (int i = M; i <= N; i++) {
            if (prime[i] != 1) System.out.println(i);
        }
    }
}
