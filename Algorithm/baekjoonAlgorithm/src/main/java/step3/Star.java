package step3;

import java.io.*;

// 2438
public class Star {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                bufferedWriter.write("*");
            }
            bufferedWriter.write("*" + "\n");
        }
        bufferedWriter.close();
    }
}
