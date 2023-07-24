package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 4948
public class BertrandPostulate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int[] prime = new int[(2 * n) + 1];
            prime[0] = 1;
            prime[1] = 1;

            for (int i = 2; i <= (2 * n); i++) {
                for (int j = 2; (i * j) <= (2 * n); j++) {
                    prime[i * j] = 1;
                }
            }

            int cnt = 0;
            for (int i = (n + 1); i <= (2 * n); i++) {
                if (prime[i] != 1) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
