package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 8393
public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] sum = new int[n];

        for (int i = n-1; i >= 0; i--) {
            sum[i] = n;
            --n;
        }
        System.out.println(Arrays.stream(sum).sum());
    }

/*  // 재귀 함수 이용
    private static int f(int n) {
        if (n <= 1) {
            return n;
        } else {
            return f(n-2)+f(n-1);
        }
    }
*/
}
