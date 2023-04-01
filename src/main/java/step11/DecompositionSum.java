package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2231
public class DecompositionSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int size = N.length();
        int min = Integer.parseInt(N) - (9 * size);
        int result = 0;

        for (int i = min; i < Integer.parseInt(N); i++) {
            int sum = i;
            int temp = i;
            while (temp > 0) {
                sum += temp / 10;
                temp /= 10;
            }
        }


    }
}
