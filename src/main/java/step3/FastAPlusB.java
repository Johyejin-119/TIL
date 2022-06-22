package step3;

import java.io.*;

// 15552
public class FastAPlusB {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < t; i++) {
            String[] sum = new String[2];
            sum = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(sum[0]);
            int b = Integer.parseInt(sum[1]);

            bufferedWriter.write(a + b + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
