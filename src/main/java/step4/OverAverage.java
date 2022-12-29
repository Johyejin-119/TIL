package step4;

import java.io.*;
import java.util.StringTokenizer;

// 4344
public class OverAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str;

        for (int i = 0; i < n; i++) {

            str = new StringTokenizer(br.readLine(), " ");
            int stdNum = Integer.parseInt(str.nextToken());
            arr = new int[stdNum];
            double scoreSum = 0;

            for (int j = 0; j < stdNum; j++) {
                arr[j] = Integer.parseInt(str.nextToken());
                scoreSum += arr[j];
            }


            double average = (scoreSum / stdNum);
            double count = 0;
            for (int j = 0; j < stdNum; j++) {
                if (arr[j] > average) {
                    count++;
                }
            }
            bw.write(String.format("%.3f", (count / stdNum) * 100) + "%\n");
        }
        bw.close();
    }
}
