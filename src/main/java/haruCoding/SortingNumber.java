package haruCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2750
public class SortingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] sortValues = new int[N];

        for (int i = 0; i < N; i++) {
            sortValues[i] = Integer.parseInt(br.readLine());
        }
    }
}
