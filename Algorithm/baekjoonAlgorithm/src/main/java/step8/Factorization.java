package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 11653
public class Factorization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> factor = new ArrayList<>();

        for (int j = 2; j <= N; j++) {
            while (N % j == 0) {
                int temp = N / j;
                factor.add(j);
                if (N % j != 0) {
                    factor.add(N);
                    break;
                }
                N = temp;
            }
        }
        factor.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
    }
}
