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

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (sortValues[j] > sortValues[j + 1]) {
                    int temp = sortValues[j];
                    sortValues[j] = sortValues[j + 1];
                    sortValues[j + 1] = temp;
                }
            } 
        }
    }
}
