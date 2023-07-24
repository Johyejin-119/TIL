package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1978
public class FindPrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        int cnt;
        int decimal = 0;

        for (int i = 0; i < N; i++) {
            int S = Integer.parseInt(str.nextToken());
            cnt = 0;
            for (int j = 2; j < S; j++) {
                if (S%j == 0) cnt++;
            }
            if (cnt == 0 && S != 1) decimal++;
        }
        System.out.println(decimal);
    }
}
