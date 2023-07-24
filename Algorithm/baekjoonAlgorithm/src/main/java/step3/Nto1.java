package step3;

import java.io.*;

// 2742
public class Nto1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = n; i > 0; i--) {
            bw.write(i + "\n");
        }
        bw.close();
    }
}
