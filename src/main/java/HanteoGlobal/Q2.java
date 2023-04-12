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
        System.out.println(count);
    }

}
