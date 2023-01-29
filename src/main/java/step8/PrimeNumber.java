package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 2581
public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        List<Integer> decimal = new ArrayList<>();
        int cntDecimal;

        for (int i = M; i <= N; i++) {
            cntDecimal = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) cntDecimal++;
            }
            if (cntDecimal == 0 && i != 1) decimal.add(i);
        }
        if (decimal.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(decimal.stream().mapToInt(Integer::intValue).sum() + "\n" + decimal.stream().mapToInt(x -> x).min().getAsInt());
        }
    }
}
