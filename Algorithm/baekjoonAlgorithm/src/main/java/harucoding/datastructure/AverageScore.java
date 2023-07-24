package harucoding.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1546
public class AverageScore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        long sum = 0, max = 0;
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(str.nextToken());
            if (temp > max) max = temp;
            sum += temp;
        }
        System.out.println(sum * 100.0 / max / N);
    }
}
