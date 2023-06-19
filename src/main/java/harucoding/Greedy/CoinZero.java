package harucoding.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 11047
public class CoinZero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(str.nextToken()); // 동전 개수
        int K = Integer.parseInt(str.nextToken()); // 목표 가격
        int coins[] = new int[N]; // 동전 금액

        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        br.close();
    }
}
