package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2798
public class BlackJack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());
        int[] card = new int[N];

        str = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(str.nextToken());
        }
        br.close();

        int result = sumCard(card, N, M);
        System.out.println(result);
    }

    private static int sumCard(int[] card, int n, int m) {
        int res = 0;
        return res;
    }

}
