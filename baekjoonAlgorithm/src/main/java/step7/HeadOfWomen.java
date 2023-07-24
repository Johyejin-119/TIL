package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2775
public class HeadOfWomen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int K;
        int N;

        for (int i = 0; i < T; i++) {
            K = Integer.parseInt(br.readLine());
            N = Integer.parseInt(br.readLine());
            sb.append(floor(K, N)).append('\n');
        }
        System.out.println(sb);
    }

    private static int floor(int K, int N) {
        if (K == 0) return N;
        if (N == 1) return 1;
        return floor(K, N-1) + floor(K-1, N);
    }
}
