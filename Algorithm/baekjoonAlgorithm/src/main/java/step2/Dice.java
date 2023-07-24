package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 2480
public class Dice {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());

        if (a == b && b == c && c == a) {
            System.out.println(10000 + (a * 1000));
        } else if (a == b || b == c) {
            System.out.println(1000 + (b * 100));

        } else if (a == c) {
            System.out.println(1000 + (a * 100));
        } else {
            System.out.println(Math.max(Math.max(a, b), c) * 100);
        }
        bufferedReader.close();


        /*
        int[] dice = new int[] {a, b, c};

        // 최댓값 받아오기
        int max = Arrays.stream(dice).max().getAsInt();

        // count 값 받아오기
        int cnt = Math.toIntExact(Arrays.stream(dice).count());
        */

    }
}
