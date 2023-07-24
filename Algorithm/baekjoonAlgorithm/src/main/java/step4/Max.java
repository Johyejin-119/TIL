package step4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 2562
public class Max {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int index = 0;
        int max = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            // 가장 큰 수(max)가 몇 번째(index)로 입력된 값인 가?
            if (arr[i] > max) { // 큰 수일 때만
                max = arr[i];
                index = i+1;
            }
        }
        bw.write(String.valueOf(max) + "\n");
        bw.write(String.valueOf(index));
        bw.close();
    }
}
