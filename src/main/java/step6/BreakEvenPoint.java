package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1712
public class BreakEvenPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());
        int C = Integer.parseInt(str.nextToken());
        if (C <= B) {
            System.out.println(-1);
        } else {
            System.out.println(A / (C-B) + 1);
        }
    }
}
