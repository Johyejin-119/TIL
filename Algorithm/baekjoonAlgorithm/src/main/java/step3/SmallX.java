package step3;

import java.io.*;

// 10871
public class SmallX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int x = Integer.parseInt(str[1]);


        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(arr[i]);
            if (a < x) {
                bw.write(a + " ");
            }
        }
        bw.close();
    }
}
