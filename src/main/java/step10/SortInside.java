package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1427
public class SortInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] num = new int[10];

        for (int i = 0; i < N.length(); i++) {
            num[Integer.parseInt(String.valueOf(N.charAt(i)))]++;
        }
        br.close();


        for (int i = 9; i >= 0; i--) {
            if (num[i] > 0) {
                System.out.print(i);
            }
        }
    }
}
