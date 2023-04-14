package HanteoGlobal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {
    static int[] coins;
    static int count = 0;
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "= ,[]{}");

        int sum = 0;
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.equals("sum")) {
                sum = Integer.parseInt(st.nextToken());
            } else if (token.equals("coins")) {
                n = st.countTokens();
                coins = new int[n];
                for (int i = 0; i < n; i++) {
                    coins[i] = Integer.parseInt(st.nextToken());
                }
            }
        }
        dfs(0, sum);
        System.out.println(count);
    }

    public static void dfs(int depth, int sum) {
        if (depth == n) {
            if (sum == 0) {
                count++;
            }
            return;
        }
        // 모든 경우의 수 탐색
        for (int i = 0; i <= sum / coins[depth]; i++) {
            dfs(depth + 1, sum - coins[depth] * i); // 재귀 호출
        }
    }
}
