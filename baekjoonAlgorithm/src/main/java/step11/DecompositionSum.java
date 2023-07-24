package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2231
public class DecompositionSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int size = String.valueOf(N).length();
        int min = N - (9 * size);
        int result = 0;

        for (int i = min; i < N; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (i + sum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
