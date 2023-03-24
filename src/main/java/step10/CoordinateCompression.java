package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

// 18870
public class CoordinateCompression {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] originCC = new int[N];
        int[] sortedCC = new int[N];
        HashMap<Integer, Integer> rankCC = new HashMap<>();

        StringTokenizer str;
        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine(), " ");
            originCC[i] = sortedCC[i] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(sortedCC);

        int count = 0;
        for (int temp : sortedCC) {
            if (!rankCC.containsKey(temp)) {
                rankCC.put(temp, count);
                count++;
            }
        }
    }
}
