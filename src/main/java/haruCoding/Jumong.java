package haruCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 1940
public class Jumong {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(numbers);

        int min  = 0;
        int max  = N-1;
        int count = 0;
        while (min < max) {
            if (numbers[min] + numbers[max] < M) {
                min++;
            } else if (numbers[min] + numbers[max] > M) {
                max--;
            } else {
                count++; min++; max--;
            }
        }
        System.out.println(count);
    }
}
