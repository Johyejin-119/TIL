package harucoding.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1929
public class FindingDecimal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(str.nextToken());
        int N = Integer.parseInt(str.nextToken());
        br.close();
        
        int[] decimal = new int[N + 1];
        for (int i = 2; i < decimal.length; i++) {
            decimal[i] = i;           
        }
        for (int i = 2; i <= Math.sqrt(N); i++) { // 에라토스테네스의 체
            if (decimal[i] == 0) continue; // 이미 소수가 아닌 경우
            for (int j = i + i; j <= N; j = j + i) { // 현재 소수의 배수 값 찾기(+i)
                decimal[j] = 0; // 소수가 아님을 표시
            }
        }
        for (int i = M; i <= N; i++) {
            if (decimal[i] != 0) System.out.println(decimal[i]);
        }
    }
}
