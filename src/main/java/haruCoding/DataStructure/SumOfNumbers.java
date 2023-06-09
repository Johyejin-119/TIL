package haruCoding.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2018
public class SumOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int start = 1, end = 1, count = 1, sum = 1;
        while (end != N) {
            if (sum == N) {
                count++; end++; sum += end;
            } else if (sum < N) {
                end++; sum += end;
            } else if (sum > N) {
                sum -= start; start++;
            }
        }
        System.out.print(count);
    }
}
