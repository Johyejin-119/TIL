package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10989
public class NumberSort3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] counting = new int[10001];

        for (int i = 0; i < N; i++) {
            counting[Integer.parseInt(br.readLine())]++;
        }
        br.close();
        for (int i = 1; i < counting.length; i++) {
            while (counting[i] > 0) {
                sb.append(i).append("\n");
                counting[i]--;
            }
        }
        System.out.println(sb);
    }
}
