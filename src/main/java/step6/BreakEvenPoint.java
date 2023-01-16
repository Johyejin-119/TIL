package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1712
public class BreakEvenPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);
        int count = 0;

        while ( (C*count) <= (A + (B * count))) {
            count++;
        }
        if ((C*count) > (A + (B * count))){
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
