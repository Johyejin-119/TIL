package haruCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1874
public class CreateSequenceStack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];
        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(br.readLine());

        }

    }
}
