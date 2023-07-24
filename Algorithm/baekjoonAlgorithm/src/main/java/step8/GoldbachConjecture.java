package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 9020
public class GoldbachConjecture {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] sumResult = getPrime(N);
            System.out.println(sumResult[1] + " " + sumResult[0]);
        }
    }
    private static int[] sumOfPrime(int n, List<Integer> result) {
        int[] sumPrimes = new int[2];
        int min = n;

        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j <= i; j++) {
                int sum = result.get(i) + result.get(j);

                if (sum == n) {
                    if (min > Math.abs(result.get(j) - result.get(i))) {
                        sumPrimes[0] = result.get(i);
                        sumPrimes[1] = result.get(j);
                    }
                    min = Math.abs(result.get(j) - result.get(i));
                }
            }
        }
        return sumPrimes;
    }

    private static int[] getPrime(int N) {
        int[] prime = new int[N + 1];
        List<Integer> result = new ArrayList<>();
        prime[0] = 1;
        prime[1] = 1;

        for (int i = 2; i <= N; i++) {
            for (int j = 2; i*j <= N; j++) {
                prime[i*j] = 1;
            }
        }

        for (int i = 2; i <= N; i++) {
            if (prime[i] != 1) result.add(i);
        }
        return sumOfPrime(N, result);
    }
}
