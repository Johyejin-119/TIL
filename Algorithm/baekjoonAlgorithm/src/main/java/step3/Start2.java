package step3;

import java.io.*;

// 2439
public class Start2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                bufferedWriter.write(" ");
            }
            for (int k = 1; k <= i; k++) {
                bufferedWriter.write("*");
            }
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
