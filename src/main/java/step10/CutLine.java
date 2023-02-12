package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 25305
public class CutLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());
        List<Integer> score = new ArrayList<>();

        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            score.add(Integer.parseInt(str.nextToken()));
        }
        score.sort(Comparator.reverseOrder());
        System.out.println(score.get(K-1));
    }
}
