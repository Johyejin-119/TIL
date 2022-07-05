package step4;

import java.io.*;
import java.util.*;

// 10818
public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        int cnt = 0;
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            arr.add(cnt, Integer.parseInt(str.nextToken()));
//            cnt++;
//        }
//        bw.write(String.valueOf(Collections.min(arr)) + " " + Collections.max(arr));
//        bw.close();

        int[] arr = new int[n];
        while (str.hasMoreTokens()) {
            arr[cnt] = Integer.parseInt(str.nextToken());
            cnt++;
        }
        Arrays.sort(arr);
        bw.write(arr[0] + " " + arr[n-1]);
        bw.close();

    }
}
