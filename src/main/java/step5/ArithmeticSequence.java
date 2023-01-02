package step5;

import java.io.*;

// 1065
public class ArithmeticSequence {
    public static int arithmeticSequenceN(int n) {
        int result;

        if (n < 100) {
            result = n;
        } else {
            result = 99;
            if (n == 1000) {
                n = 999;
            }
            int[] as = new int[3];
            for (int i = 100; i <= n; i++) {
                 as[0] = i / 100;
                 as[1] = (i / 10) % 10;
                 as[2] = i % 10;

                 if ((as[0] - as[1]) == (as[1] - as[2])) result++;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(arithmeticSequenceN(Integer.parseInt(br.readLine()))));
        bw.close();
    }
}
